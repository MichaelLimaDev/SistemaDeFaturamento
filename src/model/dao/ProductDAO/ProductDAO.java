package model.dao.ProductDAO;

import model.dao.CRUD;
import model.dao.ConnectionDAO;
import model.entity.Product;

import java.util.ArrayList;

public class ProductDAO extends ConnectionDAO implements CRUD {
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
    public ArrayList<Product> getAllDatabase() {
        return null;
    }


}
