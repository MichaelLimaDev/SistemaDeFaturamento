package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDAO {
    protected Connection connection;
    private String status = "Banco nao conectado";

    private final static String URL = "jdbc:mysql://localhost/sistemadefaturamento";
    private final static String USER = "root";
    private final static String PASSWORD = "Micha123456";

    public ConnectionDAO() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            this.status = "STATUS --> Banco de dados conectado com sucesso";
        } catch (SQLException err) {
            err.printStackTrace();
            this.status = "STATUS --> Erro ao conectar com o banco...";
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
            this.status = "STATUS --> Conexão fechada";
        } catch (SQLException err) {
            err.printStackTrace();
            this.status = "STATUS --> Erro ao fechar a conexão - Tentando novamente";
            closeConnection();
        }
    }

    public String getStatus() {
        return this.status;
    }
}
