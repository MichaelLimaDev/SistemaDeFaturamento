package model.dao;

import model.entity.Invoice;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InvoiceDAO extends ConnectionDAO {
    public ArrayList<Invoice> getAllInvoicesDatabase() {
        ArrayList<Invoice> invoices = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "select v.id, v.totalValue, v.id_product from Invoice");

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Invoice invoice = new Invoice();

                invoice.setId(resultSet.getInt("v.id"));
                invoice.setValorTotal(resultSet.getDouble("v.totalValue"));
                invoice.setListProduct(new ProductDAO().getAllProductsDatabase());

                invoices.add(invoice);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }

        return invoices;
    }
}
