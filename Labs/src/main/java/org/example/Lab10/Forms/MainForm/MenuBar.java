package org.example.Lab10.Forms.MainForm;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar {
    public MenuBar(ActionListener modeChangeListener) {
        JMenu modeMenu = new JMenu("CRUD Mode");
        JMenuItem selectItem = new JMenuItem("Read");
        JMenuItem addItem = new JMenuItem("Create");
        JMenuItem editItem = new JMenuItem("Update");
        JMenuItem deleteItem = new JMenuItem("Delete");

        selectItem.addActionListener(modeChangeListener);
        addItem.addActionListener(modeChangeListener);
        editItem.addActionListener(modeChangeListener);
        deleteItem.addActionListener(modeChangeListener);

        modeMenu.add(selectItem);
        modeMenu.add(addItem);
        modeMenu.add(editItem);
        modeMenu.add(deleteItem);

        add(modeMenu);
    }
}
