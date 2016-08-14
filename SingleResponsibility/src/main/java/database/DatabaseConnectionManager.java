package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by yshen on 8/7/16.
 */
public class DatabaseConnectionManager {

    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {

    }

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection("URL");
        System.out.println("Established Database Connection...");
    }

    public Connection getConectionObject() {
        return conn;
    }

    public void disconnect() throws SQLException {
        conn.close();
        System.out.println("Disconnected from Database...");
    }
}
