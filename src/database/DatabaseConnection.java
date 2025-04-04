package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/appgestaosustentavel";
    private static final String USER = "postgres";
    private static final String PASSWORD = "8990";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver do PostgreSQL não encontrado.", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void TesteConnection() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            } else {
                System.out.println("Falha ao estabelecer conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}


