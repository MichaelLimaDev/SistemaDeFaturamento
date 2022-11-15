package model.dao.InvoiceDAO.functions;

import model.dao.ConnectionDAO;
import model.dao.ProductDAO.functions.GetAllProductsDatabase;
import model.entity.Invoice;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetAllInvoicesDadabase extends ConnectionDAO {
    public ArrayList<Invoice> getAllInvoicesDatabase() {
        Product product = new Product();
        ArrayList<Invoice> invoices = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "select id, totalValue, id_product from Invoice");

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Invoice invoice = new Invoice();

                invoice.setId(resultSet.getInt("id"));
                invoice.setValorTotal(resultSet.getDouble("totalValue"));
                invoice.setProduct(resultSet.getInt(product.getId()));

                invoices.add(invoice);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }

        return invoices;
    }
}
