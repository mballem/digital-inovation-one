package me.dio.tunitarios;

import me.dio.tunitarios.dao.H2Connection;
import org.h2.engine.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class CondicionaTeste {

    @Order(1)
    @Test
    @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "6")
    void validarVersaoH2Database() throws SQLException {
        Connection conn = H2Connection.getConnection();
        String version = conn.getMetaData().getDatabaseProductVersion();
        Assertions.assertEquals("2.1.210 (2022-01-17)", version);
    }

    @Order(2)
    @Test
    @EnabledIfSystemProperty(named = "user.language", matches = "pt")
    void validarVersaoH2Database_() throws SQLException {
        Connection conn = H2Connection.getConnection();
        String version = conn.getMetaData().getDatabaseProductVersion();
        Assertions.assertEquals("2.1.210 (2022-01-17)", version);
    }

    @Order(5)
    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_10)
    void validarVersaoH2Database__() throws SQLException {
        Connection conn = H2Connection.getConnection();
        String version = conn.getMetaData().getDatabaseProductVersion();
        Assertions.assertEquals("2.1.210 (2022-01-17)", version);
    }

    @Order(4)
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarVersaoWindows() throws SQLException {
        Properties props = System.getProperties();
        String so = props.getProperty("os.name");
        Assertions.assertEquals("Windows 10", so);
    }

    @Order(3)
    @Test
    @DisabledOnOs({OS.LINUX, OS.MAC})
    void validarVersaoWindows_() throws SQLException {
        Properties props = System.getProperties();
        String so = props.getProperty("os.name");
        Assertions.assertEquals("Windows 10", so);
    }
}
