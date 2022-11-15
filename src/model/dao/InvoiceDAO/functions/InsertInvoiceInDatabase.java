package model.dao.InvoiceDAO.functions;

import model.dao.ConnectionDAO;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertInvoiceInDatabase extends ConnectionDAO {

    public boolean insertInvoiceDatabase() {
        boolean result;
        // Refatorar essa função
        double totalValue = 0;
        ProductDAO productDAO = new ProductDAO();

        for (Product productss: productDAO.getAllProductsDatabase()) {
            totalValue += productss.getProductValue();
        }

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "insert into invoice(totalValue, id_products) values (?, ?)");

            statement.setDouble(1, totalValue);
            statement.setInt(2, new Product().getId());

            result = statement.executeUpdate() == 1;
        } catch (SQLException err) {
            err.printStackTrace();
            result = false;
        }

        return result;
    }

}
