package model.dao.ProductDAO.functions;

import model.dao.ConnectionDAO;
import model.dao.interfaces.crud.InsertDataInDatabase;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProductDatabase extends ConnectionDAO implements InsertDataInDatabase {

    private Product product;

    @Override
    public boolean insertDatabase() {
        boolean result;
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "insert into product(productName, productValue, productQuantity) values (?, ?, ?)");

            statement.setString(1, this.product.getProductName());
            statement.setDouble(2, this.product.getProductValue());
            statement.setInt(3, this.product.getProductQuantity());

            result = statement.executeUpdate() == 1;

        } catch (SQLException err) {
            err.printStackTrace();
            result = false;
        }

        return result;
    }

}
