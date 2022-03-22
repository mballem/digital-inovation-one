package me.dio.tunitarios;

import me.dio.tunitarios.dao.H2Connection;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.*;

class H2ConnectionTest {

    static Connection connection;

    @BeforeAll
    static void abreaConexaoECriaTabelaPessoas() {
        connection = H2Connection.getConnection();
        H2Connection.createTablePessoas(connection);
    }

    @Test
    static void verificaBancoDeDadosTestExist() throws SQLException {
        String schema = connection.getSchema();
        Assertions.assertEquals("TEST", schema);
    }

    @Test
    void verificaSeTabelaPessoaExiste() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Show tables");
        System.out.print("Tables in the current database: ");
        String table = "";
        while(rs.next()) {
            table = rs.getString(1);
            System.out.println(table);
        }
        Assertions.assertEquals("PESSOAS", table);
    }

    @AfterAll
    static void finalizaConexao() {
        H2Connection.closeConnection(connection, null, null);
    }
}
