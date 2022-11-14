package model.dao.ProductDAO.functions;

import model.dao.CRUD;
import model.dao.ConnectionDAO;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetAllProductsDatabase extends ConnectionDAO {
    public ArrayList<Product> getAllDatabase() {
        ArrayList<Product> products = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "select id, productName, productValue, productQuantity from product");

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Product product = new Product();

                product.setId(result.getInt("id"));
                product.setProductName(result.getString("productName"));
                product.setProductValue(result.getDouble("productValue"));
                product.setProductQuantity(result.getInt("productQuantity"));

                products.add(product);
            }

        } catch (SQLException err) {
            err.printStackTrace();
            System.out.println("Erro de listagem");
        }

        return products;
    }
}
