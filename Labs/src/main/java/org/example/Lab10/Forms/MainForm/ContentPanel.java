package org.example.Lab10.Forms.MainForm;

import org.example.Lab10.Data.CRUDMode;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class ContentPanel extends JPanel {
    private JPanel upperPanel;
    private CRUDMode crudMode;
    private JLabel CRUDModeLabel;
    private QueryConfigurationTabbedPane queryConfigurationTabbedPane;
    private JTextField queryField;
    private JTable dataTable;
    public ContentPanel(){
        crudMode = CRUDMode.READ;

        initFormContent();
        addContent();
    }
    public void initFormContent(){
        upperPanel = new JPanel(new BorderLayout());

        queryField = new JTextField();
        queryField.setPreferredSize(new Dimension(800, 30));

        CRUDModeLabel = new JLabel(crudMode.toString());
        CRUDModeLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        CRUDModeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        queryConfigurationTabbedPane = new QueryConfigurationTabbedPane(queryField);

        dataTable = new JTable();
        JScrollPane tableScrollPane = new JScrollPane(dataTable);
        tableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tableScrollPane.setPreferredSize(new Dimension(800, 250));
    }
    public TableModel getTableModel(){
        return dataTable.getModel();
    }
    public void setTableModel(TableModel model){
        dataTable.setModel(model);
    }
    public void addContent(){
        setLayout(new BorderLayout());
        add(upperPanel, BorderLayout.NORTH);
        upperPanel.add(CRUDModeLabel, BorderLayout.NORTH);
        upperPanel.add(queryField, BorderLayout.CENTER);

        add(queryConfigurationTabbedPane, BorderLayout.CENTER);
        add(new JScrollPane(dataTable), BorderLayout.SOUTH);
    }
    public CRUDMode getCrudMode(){
        return crudMode;
    }
    public void setCRUDMode(CRUDMode crudMode){
        this.crudMode = crudMode;
        this.CRUDModeLabel.setText(crudMode.toString());
        queryConfigurationTabbedPane.setCrudMode(crudMode);
    }
    public String getQuery(){
        return queryField.getText();
    }
}
