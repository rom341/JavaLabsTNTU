package org.example.Lab10.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLProcessor {
    private final String connectionString;

    public SQLProcessor(String connectionString) {
        this.connectionString = connectionString;
    }

    public Connection getConnection(String query) throws SQLException {
        return DriverManager.getConnection(connectionString);
    }

    // Method to execute a SELECT query and return the result set
    public ResultSet executeQuery(String query) throws SQLException {
        try (Connection connection = DriverManager.getConnection(connectionString);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            return preparedStatement.executeQuery();
        }
    }

    // Method to execute an INSERT, UPDATE, or DELETE query
    public int executeUpdate(String query) throws SQLException {
        try (Connection connection = DriverManager.getConnection(connectionString);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            return preparedStatement.executeUpdate();
        }
    }
}

