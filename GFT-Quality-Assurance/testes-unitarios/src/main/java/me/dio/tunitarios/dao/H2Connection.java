package me.dio.tunitarios.dao;

import java.sql.*;

public class H2Connection {
    // JDBC driver name and database URL
    static final String URL = "jdbc:h2:~/test";
    static final String DRIVER = "org.h2.Driver";
    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void closeConnection(Connection conn, ResultSet rs, PreparedStatement pstm) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createTablePessoas(Connection conn) {
        String sql = null;
        try {
            sql =  "DROP TABLE IF EXISTS PESSOAS; " +
                    "CREATE TABLE PESSOAS " +
                    "(id_pessoa INTEGER not null, " +
                    " nome VARCHAR(40) not null, " +
                    " nascimento DATE not null, " +
                    " PRIMARY KEY ( id_pessoa ));";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("CreateTables.createTablePessoas Ok!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
