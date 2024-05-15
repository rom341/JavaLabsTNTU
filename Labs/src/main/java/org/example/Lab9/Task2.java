package org.example.Lab9;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String[] keys = {"Name", "SecondName", "Age", "Location", "Status"};
        for (String key : keys) {
            AddElementToCollectionAndPRintToConsoleInThread addElementToCollectionAndPRintToConsoleInThread = new AddElementToCollectionAndPRintToConsoleInThread(result, key);
            Thread thread = new Thread(addElementToCollectionAndPRintToConsoleInThread);
            thread.start();
        }

        System.out.println("Result: " + result);
    }
}
