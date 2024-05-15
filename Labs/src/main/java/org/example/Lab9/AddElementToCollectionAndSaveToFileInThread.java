package org.example.Lab9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AddElementToCollectionAndSaveToFileInThread implements Runnable {
    private Map<String, String> textMap = new HashMap<>();
    private Collection<String> collection;
    private String key;
    private String fileName;

    public AddElementToCollectionAndSaveToFileInThread(Collection<String> collection, String key, String fileName) {
        insertTestDataIntoMap();

        this.collection = collection;
        this.key = key;
        this.fileName = fileName;
    }

    private void insertTestDataIntoMap() {
        textMap.put("Name", "Walter");
        textMap.put("SecondName", "White");
        textMap.put("Status", "Alive");
        textMap.put("Age", "50");
        textMap.put("Occupation", "Chemist");
        textMap.put("Location", "Albuquerque");
    }

    @Override
    public void run() {
        String value = textMap.get(key);
        collection.add(value);
        System.out.println("Printed to file: " + collection);
        saveToFile(collection.toString());
    }

    private void saveToFile(String value) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
