package org.example.Lab5.MainTask1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperator {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileOperator()
    {
        this.fileName = "src/main/java/org/example/Lab5/MainTask1/MainTask1.txt";
    }

    public FileOperator(String fileName) {
        this.fileName = fileName;
    }

    public String readAllTextFromFile()
    {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            StringBuilder result = new StringBuilder();

            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine());
            }
            scanner.close();
            return result.toString();
        }
        catch (FileNotFoundException e)
        {
            System.out.printf("File %s is not found\n", fileName);
            return  "";
        }
    }

    public boolean writeTextToFile(String text) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
