package org.example.Lab10.Forms.MainForm;

import org.example.Lab10.Data.CRUDMode;
import org.example.Lab10.Data.QueryBuilder;
import org.example.Lab10.Database.SQLProcessor;

import javax.swing.*;
import java.awt.*;

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
        executeButton = new ExecuteButton(e -> {});
    }
    private void addFormContent(){
        setLayout(BorderLayout);
        setJMenuBar(menuBar);
        add(queryTextField, java.awt.BorderLayout.NORTH);
        add(contentPanel, java.awt.BorderLayout.CENTER);
        add(executeButton, java.awt.BorderLayout.SOUTH);
    }
    private void configureForm(){
        setSize(1000, 700);
    }
}
