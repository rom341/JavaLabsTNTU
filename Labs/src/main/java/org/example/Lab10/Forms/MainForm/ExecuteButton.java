package org.example.Lab10.Forms.MainForm;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ExecuteButton extends JButton {
    public ExecuteButton(ActionListener executeButtonListener) {
        super("Execute");
        setSize(100, 30);
        addActionListener(executeButtonListener);
    }
}
