package org.example.Lab7;

import org.example.Lab7.Forms.MainForm.MainForm;

import javax.swing.*;

public class Launch {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm();
            }
        });
    }
}
