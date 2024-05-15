package org.example.Lab10.Forms.MainForm;

import org.example.Lab10.Data.CRUDMode;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {
    private CRUDMode crudMode;
    private BorderLayout borderLayout;
    private JLabel CRUDModeLabel;
    private QueryConfigurationTabbedPane queryConfigurationTabbedPane;
    public ContentPanel(){
        crudMode = CRUDMode.READ;

        initFormContent();
        addContent();
    }
    public void initFormContent(){
        borderLayout = new BorderLayout();

        CRUDModeLabel = new JLabel(crudMode.toString());
        CRUDModeLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        CRUDModeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        queryConfigurationTabbedPane = new QueryConfigurationTabbedPane();
    }
    public void addContent(){
        setLayout(borderLayout);
        add(CRUDModeLabel, BorderLayout.NORTH);
        add(queryConfigurationTabbedPane, BorderLayout.CENTER);
    }
    public void setCRUDMode(CRUDMode crudMode){
        this.crudMode = crudMode;
        this.CRUDModeLabel.setText(crudMode.toString());
    }
}
