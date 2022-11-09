package model.dao;

import Invoice.product.Product;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO extends ConnectionDAO {
    public boolean insertProductDatabase(Product product) {
        boolean result;
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "insert into product(productName, productValue, productQuantity) values (?, ?, ?)");

            statement.setString(1, product.getProductName());
            statement.setDouble(2, product.getProductValue());
            statement.setInt(3, product.getProductQuantity());

            result = statement.executeUpdate() == 1;

        } catch (SQLException err) {
            err.printStackTrace();
            result = false;
        }

        return result;
    }

    public void updateProductDatabase(int id, String productName, double productValue, int productQuantity) {
    }

    public boolean deleteProductDatabase(int idProduct) {
        boolean result;

        try {
            PreparedStatement statement = connection.prepareStatement("delete from product where id = (select id from product where id = ?)");

            statement.setInt(1, idProduct);

            result = statement.executeUpdate() == 1;

        } catch(SQLException err) {
            err.printStackTrace();
            result = false;
        }

        return result;
    }
}
