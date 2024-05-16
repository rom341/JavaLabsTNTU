package org.example.Lab10.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TableCreator {
    private SQLProcessor sqlProcessor;

    public TableCreator(SQLProcessor sqlProcessor) {
        this.sqlProcessor = sqlProcessor;
    }

    public SQLProcessor getSqlProcessor() {
        return sqlProcessor;
    }

    public void setSqlProcessor(SQLProcessor sqlProcessor) {
        this.sqlProcessor = sqlProcessor;
    }

    public boolean createTable(String createTableQuery) {
        try {
            sqlProcessor.executeUpdate(createTableQuery);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void createAllTablesIfNotExists() {
        String[] createTableQueries = {

                "CREATE TABLE Room (" +
                        "ID BIGINT PRIMARY KEY," +
                        "Owner BIGINT," +
                        "GameStage VARCHAR(20)," +
                        "Timer BIGINT," +
                        "Chat BIGINT" +
                        ")",

                "CREATE TABLE ServiceToRoomConnection (" +
                        "ID BIGINT PRIMARY KEY," +
                        "ServiceID BIGINT NOT NULL," +
                        "RoomID BIGINT NOT NULL" +
                        ")",

                "CREATE TABLE Users (" +
                        "ID BIGINT PRIMARY KEY," +
                        "Login VARCHAR(20)," +
                        "Name VARCHAR(20)," +
                        "Status BIGINT," +
                        "Role BIGINT" +
                        ")",

                "CREATE TABLE RoomToUsersConnection (" +
                        "ID BIGINT PRIMARY KEY," +
                        "RoomID BIGINT NOT NULL," +
                        "UserID BIGINT NOT NULL" +
                        ")",

                "CREATE TABLE Status (" +
                        "ID BIGINT PRIMARY KEY," +
                        "IsAlive BIT NOT NULL" +
                        ")",

                "CREATE TABLE Role (" +
                        "ID BIGINT PRIMARY KEY," +
                        "Name VARCHAR(20)," +
                        "Description Text," +
                        "Health SMALLINT," +
                        "Damage SMALLINT," +
                        "WinCondition VARCHAR(10)" +
                        ")",

                "CREATE TABLE Timer (" +
                        "ID BIGINT PRIMARY KEY," +
                        "TriggerTime BIGINT," +
                        "CurrentTime BIGINT" +
                        ")",

                "CREATE TABLE Chat (" +
                        "ID BIGINT PRIMARY KEY" +
                        ")",

                "CREATE TABLE ChatToRolesConnection (" +
                        "ID BIGINT PRIMARY KEY," +
                        "ChatID BIGINT," +
                        "RoleID BIGINT" +
                        ")",

                "CREATE TABLE Message (" +
                        "ID BIGINT PRIMARY KEY," +
                        "Sender BIGINT," +
                        "SendTime BIGINT," +
                        "MessageText Text" +
                        ")",

                "CREATE TABLE ChatToMessageConnection (" +
                        "ID BIGINT PRIMARY KEY," +
                        "ChatID BIGINT," +
                        "MessageID BIGINT" +
                        ")"
        };


        for (int i = 0; i < createTableQueries.length; i++) {
            createTable(createTableQueries[i]);
        }
    }

}

