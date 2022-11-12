package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDAO {

    protected Connection connection;

    final static String URL = "jdbc:mysql://localhost/sistemadefaturamento";
    final static String USER = "root";
    final static String PASSWORD = "M1ch4elux2";

    public ConnectionDAO() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
}
