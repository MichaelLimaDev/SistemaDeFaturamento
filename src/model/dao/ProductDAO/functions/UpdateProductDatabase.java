package model.dao.ProductDAO.functions;

import model.dao.ConnectionDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProductDatabase extends ConnectionDAO {
    public boolean updateProductDatabase(int id, String newProductName, double newProductValue, int newProductQuantity) {
        boolean result;

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "update product productName = ?, productValue = ?, productQuantity where id = ?");

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
}
