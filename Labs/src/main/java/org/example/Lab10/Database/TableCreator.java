package org.example.Lab10.Database;

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

    public void recreateAllTables() {
        String[] createTableQueries = {
                "DROP TABLE IF EXISTS Service; " +
                        "CREATE TABLE Service (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "URL VARCHAR(1000) NOT NULL, " +
                        "Localization VARCHAR(1000) NOT NULL" +
                        ")",

                "DROP TABLE IF EXISTS Room; " +
                        "CREATE TABLE Room (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "Owner BIGINT, " +
                        "GameStage VARCHAR(20), " +
                        "Timer BIGINT, " +
                        "Chat BIGINT" +
                        ")",

                "DROP TABLE IF EXISTS ServiceToRoomConnection; " +
                        "CREATE TABLE ServiceToRoomConnection (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "ServiceID BIGINT NOT NULL, " +
                        "RoomID BIGINT NOT NULL" +
                        ")",

                "DROP TABLE IF EXISTS Users; " +
                        "CREATE TABLE Users (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "Login VARCHAR(20), " +
                        "Name VARCHAR(20), " +
                        "Status BIGINT, " +
                        "Role BIGINT" +
                        ")",

                "DROP TABLE IF EXISTS RoomToUsersConnection; " +
                        "CREATE TABLE RoomToUsersConnection (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "RoomID BIGINT NOT NULL, " +
                        "UserID BIGINT NOT NULL" +
                        ")",

                "DROP TABLE IF EXISTS Status; " +
                        "CREATE TABLE Status (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "IsAlive BIT NOT NULL" +
                        ")",

                "DROP TABLE IF EXISTS Role; " +
                        "CREATE TABLE Role (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "Name VARCHAR(20), " +
                        "Description VARCHAR(1000), " +
                        "Health SMALLINT, " +
                        "Damage SMALLINT, " +
                        "WinCondition VARCHAR(10)" +
                        ")",

                "DROP TABLE IF EXISTS Timer; " +
                        "CREATE TABLE Timer (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "TriggerTime BIGINT, " +
                        "CurrentTime BIGINT" +
                        ")",

                "DROP TABLE IF EXISTS Chat; " +
                        "CREATE TABLE Chat (" +
                        "ID BIGINT PRIMARY KEY IDENTITY" +
                        ")",

                "DROP TABLE IF EXISTS ChatToRolesConnection; " +
                        "CREATE TABLE ChatToRolesConnection (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "ChatID BIGINT, " +
                        "RoleID BIGINT" +
                        ")",

                "DROP TABLE IF EXISTS Message; " +
                        "CREATE TABLE Message (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "Sender BIGINT, " +
                        "SendTime BIGINT, " +
                        "MessageText VARCHAR(1000)" +
                        ")",

                "DROP TABLE IF EXISTS ChatToMessageConnection; " +
                        "CREATE TABLE ChatToMessageConnection (" +
                        "ID BIGINT PRIMARY KEY IDENTITY, " +
                        "ChatID BIGINT, " +
                        "MessageID BIGINT" +
                        ")"
        };



        for (int i = 0; i < createTableQueries.length; i++) {
            createTable(createTableQueries[i]);
        }
    }

}

