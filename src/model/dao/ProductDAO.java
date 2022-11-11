package model.dao;

import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public ArrayList<Product> getAllProductsDatabase(int id) {
        ArrayList<Product> products = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "select p.id, p.productName, p.productValue, p.productQuantity from products where id = ?");

            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Product product = new Product();

                product.setId(result.getInt("p.id"));
                product.setProductName(result.getString("p.productName"));
                product.setProductValue(result.getDouble("p.productValue"));
                product.setProductQuantity(result.getInt("p.productQuantity"));

                products.add(product);
            }

        } catch (SQLException err) {
            err.printStackTrace();
            System.out.println("Erro de listagem");
        }

        return products;
    }


    public boolean updateProductDatabase(int id, String newProductName, double newProductValue, int newProductQuantity) {
        boolean result;

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "update products productName = ?, productValue = ?, productQuantity where id = ?");

            statement.setString(1, newProductName);
            statement.setDouble(2, newProductValue);
            statement.setInt(3, newProductQuantity);
            statement.setInt(4, id);

            result = statement.executeUpdate() == 1;

        } catch (SQLException err) {
            err.printStackTrace();
            result = false;
        }

        return result;
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
