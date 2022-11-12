package model.dao.ProductDAO.functions;

import model.dao.ConnectionDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteProductDatabase extends ConnectionDAO {
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
