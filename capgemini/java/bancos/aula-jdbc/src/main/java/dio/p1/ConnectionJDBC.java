package dio.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/dio_jdbc?serverTimezone=America/Sao_Paulo";
        Connection conn = null;

        try (Connection connection = conn = DriverManager.getConnection(url, "root", "root")) {
            System.out.println("SUCESSO");
        } catch (SQLException e) {
            System.out.println("FALHA: " + e.getMessage());
        }
    }
}
