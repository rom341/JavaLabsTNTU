package org.example.Lab10.Forms.MainForm;

import org.example.Lab10.Data.CRUDMode;
import org.example.Lab10.Data.QueryBuilder;
import org.example.Lab10.Database.SQLProcessor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class MainForm extends JFrame {
    private SQLProcessor sqlProcessor;
    private QueryBuilder queryBuilder;
    private MenuBar menuBar;
    private BorderLayout BorderLayout;
    private QueryTextField queryTextField;
    private ContentPanel contentPanel;
    private ExecuteButton executeButton;

    public MainForm(SQLProcessor sqlProcessor) throws HeadlessException {
        this.sqlProcessor = sqlProcessor;
        queryBuilder = new QueryBuilder();

        configureForm();
        initFormContent();
        addFormContent();
    }
    private void initFormContent(){
        BorderLayout = new BorderLayout();
        menuBar = new MenuBar(e -> {
            JMenuItem menuItem = (JMenuItem) e.getSource();
            String text = menuItem.getText();
            CRUDMode crudMode;
            switch (text) {
                case "Create" -> crudMode = CRUDMode.CREATE;
                case "Update" -> crudMode = CRUDMode.UPDATE;
                case "Delete" -> crudMode = CRUDMode.DELETE;
                default -> crudMode = CRUDMode.READ;
            }

            contentPanel.setCRUDMode(crudMode);
        });
        queryTextField = new QueryTextField();
        contentPanel = new ContentPanel();
        executeButton = new ExecuteButton(e -> {
            String query = contentPanel.getQuery();

            try (Connection connection = sqlProcessor.getConnection(query);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
            ){
                if (contentPanel.getCrudMode() == CRUDMode.READ) {
                    ResultSet resultSet = preparedStatement.executeQuery();
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

                    DefaultTableModel tableModel = new DefaultTableModel();

                    int columnCount = resultSetMetaData.getColumnCount();
                    for (int column = 1; column <= columnCount; column++) {
                        tableModel.addColumn(resultSetMetaData.getColumnName(column));
                    }

                    while (resultSet.next()) {
                        Object[] row = new Object[columnCount];
                        for (int column = 1; column <= columnCount; column++) {
                            row[column - 1] = resultSet.getObject(column);
                        }
                        tableModel.addRow(row);
                    }

                    contentPanel.setTableModel(tableModel);
                    }
                else
                    sqlProcessor.executeUpdate(query);
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "SQL ERROR: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    private void addFormContent(){
        setLayout(BorderLayout);
        setJMenuBar(menuBar);
        add(queryTextField, java.awt.BorderLayout.NORTH);
        add(contentPanel, java.awt.BorderLayout.CENTER);
        add(executeButton, java.awt.BorderLayout.SOUTH);
    }
    private void configureForm(){
        setSize(1000, 800);
    }
}
