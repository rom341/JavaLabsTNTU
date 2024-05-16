package org.example.Lab10.Forms.MainForm;

import org.example.Lab10.Data.CRUDMode;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {
    private JPanel upperPanel;
    private CRUDMode crudMode;
    private JLabel CRUDModeLabel;
    private QueryConfigurationTabbedPane queryConfigurationTabbedPane;
    private JTextField queryField;
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
    }
    public void addContent(){
        setLayout(new BorderLayout());
        add(queryConfigurationTabbedPane, BorderLayout.CENTER);
        add(upperPanel, BorderLayout.NORTH);
        upperPanel.add(CRUDModeLabel, BorderLayout.NORTH);
        upperPanel.add(queryField, BorderLayout.CENTER);
    }
    public void setCRUDMode(CRUDMode crudMode){
        this.crudMode = crudMode;
        this.CRUDModeLabel.setText(crudMode.toString());
        queryConfigurationTabbedPane.setCrudMode(crudMode);
    }
}
