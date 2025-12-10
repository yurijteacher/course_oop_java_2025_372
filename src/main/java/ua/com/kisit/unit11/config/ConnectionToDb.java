package ua.com.kisit.unit11.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {

    public Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_372_2025_2026", "root","root1234");
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  connection;
    }


}
