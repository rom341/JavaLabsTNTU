package org.example.Lab7.Forms.MainForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class ButtonPanel extends JPanel {
    private MainForm mainForm;
   private ResourceBundle bundle;
    public ButtonPanel(MainForm mainForm) {
        this.mainForm = mainForm;
        bundle = mainForm.localisation.getBundle();

        JButton generatePointsButton = new JButton(bundle.getString("CreateAndDisplayPoints"));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(generatePointsButton);

        generatePointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm.getPointContainer().GeneratePoints(10);
                int countOfPointsAtTheLeftFromMainLine = mainForm.getPointContainer().CountOfPointsAtTheLeftFromLine(mainForm.getMainLine());
                mainForm.setTitle(mainForm.defaultFormName + " | " + bundle.getString("AtTheLeftFromLine") + ": " + countOfPointsAtTheLeftFromMainLine + " points");
                mainForm.repaint();
            }
        });
    }
}
