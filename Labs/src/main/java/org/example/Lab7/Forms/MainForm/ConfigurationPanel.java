package org.example.Lab7.Forms.MainForm;

import org.example.Lab7.Data.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class ConfigurationPanel extends JPanel {
    private MainForm mainForm;
    private ResourceBundle bundle;
    private JTextField beginXField;
    private JTextField beginYField;
    private JTextField endXField;
    private JTextField endYField;

    public ConfigurationPanel(MainForm mainForm) {
        this.mainForm = mainForm;
        bundle = mainForm.localisation.getBundle();

        GridLayout gridLayout = new GridLayout(3, 2);
        setLayout(gridLayout);

        JLabel beginLabel = new JLabel(bundle.getString("BeginPoint") + "(X, Y):");
        add(beginLabel);

        Point beginPoint = mainForm.getMainLine().getBegin();
        beginXField = new JTextField(String.valueOf(beginPoint.getX()));
        add(beginXField);

        beginYField = new JTextField(String.valueOf(beginPoint.getY()));
        add(beginYField);

        JLabel endLabel = new JLabel(bundle.getString("EndPoint") + "(X, Y):");
        add(endLabel);

        Point endPoint = mainForm.getMainLine().getEnd();
        endXField = new JTextField(String.valueOf(endPoint.getX()));
        add(endXField);

        endYField = new JTextField(String.valueOf(endPoint.getY()));
        add(endYField);

        JButton applyButton = new JButton(bundle.getString("Save"));
        add(applyButton);

        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyChanges();
            }
        });
    }

    private void applyChanges() {
        try {
            int beginX = Integer.parseInt(beginXField.getText());
            int beginY = Integer.parseInt(beginYField.getText());
            mainForm.getMainLine().setBegin(new Point(beginX, beginY));

            int endX = Integer.parseInt(endXField.getText());
            int endY = Integer.parseInt(endYField.getText());
            mainForm.getMainLine().setEnd(new Point(endX, endY));

            mainForm.repaint();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, bundle.getString("Error_GoEnterInt"));
        }
    }
}
