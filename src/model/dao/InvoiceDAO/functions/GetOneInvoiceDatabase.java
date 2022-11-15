package model.dao.InvoiceDAO.functions;

import model.dao.ConnectionDAO;
import model.dao.interfaces.crud.GetOneDataOfDatabase;
import model.entity.Invoice;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetOneInvoiceDatabase extends ConnectionDAO implements GetOneDataOfDatabase {
    @Override
    public Object getOneData(int id) {
        Invoice invoice = new Invoice();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "Select id, totalValue, id_product from invoice where id = ?");

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            invoice.setId(resultSet.getInt("id"));
            invoice.setValorTotal(resultSet.getDouble("totalValue"));
            invoice.setProduct(resultSet.getInt("id_product"));

        } catch (SQLException err) {
            err.printStackTrace();
        }

        return invoice;
    }
}
