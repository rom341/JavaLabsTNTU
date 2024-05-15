package org.example.Lab9;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        final String filename = "Lab9_Task1_output.txt";
        List<String> result = new ArrayList<>();
        String[] keys = {"Name", "SecondName", "Age", "Location", "Status"};
        for (String key : keys) {
            AddElementToCollectionAndSaveToFileInThread addElement = new AddElementToCollectionAndSaveToFileInThread(result, key, filename);
            Thread thread = new Thread(addElement);
            thread.start();
        }

        System.out.println("Result: " + result);
    }
}
