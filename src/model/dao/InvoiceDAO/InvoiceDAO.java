package model.dao.InvoiceDAO;

import model.dao.CRUD;
import model.dao.ConnectionDAO;
import model.dao.ProductDAO.ProductDAO;
import model.entity.Invoice;
import model.entity.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InvoiceDAO extends ConnectionDAO implements CRUD {

    @Override
    public boolean insertDatabase() {
        return false;
    }

    @Override
    public boolean updateDatabase() {
        return false;
    }

    @Override
    public boolean deleteDatabase() {
        return false;
    }

    @Override
    public ArrayList getAllDatabase() {
        return null;
    }
}
