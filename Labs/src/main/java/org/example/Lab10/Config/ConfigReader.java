package org.example.Lab10.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String getConnectionString(String filePath) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
            return properties.getProperty("db.connectionString");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
