package model.dao.ProductDAO.functions;

import model.dao.ConnectionDAO;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProductDatabase extends ConnectionDAO {
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
}
