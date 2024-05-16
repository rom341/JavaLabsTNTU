package org.example.Lab10;

import org.example.Lab10.Config.ConfigReader;
import org.example.Lab10.Database.SQLProcessor;
import org.example.Lab10.Database.TableCreator;
import org.example.Lab10.Forms.MainForm.MainForm;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        String cfgFilePath = "src/main/java/org/example/Lab10/Config/config.properties";

        String connectionString = ConfigReader.getConnectionString(cfgFilePath);
        SQLProcessor sqlProcessor = new SQLProcessor(connectionString);
        TableCreator tableCreator = new TableCreator(sqlProcessor);

        //tableCreator.recreateAllTables();

        SwingUtilities.invokeLater(() -> {
            MainForm app = new MainForm(sqlProcessor);
            app.setVisible(true);
        });
    }
}
