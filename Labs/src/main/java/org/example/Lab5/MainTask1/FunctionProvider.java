package org.example.Lab5.MainTask1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FunctionProvider {
    public String removeExtraSpacesFromString(String line)
    {
        // \\s - any type spaces;
        // + - pervious template can be repeated more than 1 time
        return line.replaceAll("\\s+", " ");
    }
    public boolean fillFileManually(FileOperator fileOperator)
    {
        System.out.println("Enter text for file:");
        Scanner consoleScanner = new Scanner(System.in);
        String enteredText = consoleScanner.nextLine();
        return fileOperator.writeTextToFile(enteredText);
    }

    public String firstLatterBecomeLastInEveryWord(String line)
    {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstLetter = words[i].charAt(0);
                words[i] = words[i].substring(1) + firstLetter;
            }
        }
        return String.join(" ", words);
    }
    public boolean addNewTextToFile(FileOperator fileOperator, String newText)
    {
        String textFromFile = fileOperator.readAllTextFromFile();
        return fileOperator.writeTextToFile(textFromFile + newText);
    }
    public boolean replaceTextInFile(FileOperator fileOperator, String target, String newText)
    {
        String textFromFile = fileOperator.readAllTextFromFile();
        return fileOperator.writeTextToFile(
                textFromFile.replaceAll(target, newText)
        );
    }
}
