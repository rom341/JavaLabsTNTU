package org.example.Lab9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AddElementToCollectionAndPRintToConsoleInThread implements Runnable{
    private Map<String, String> textMap = new HashMap<>();
    private Collection<String> collection;
    private String key;
    public AddElementToCollectionAndPRintToConsoleInThread(Collection<String> collection, String key) {
        insertTestDataIntoMap();

        this.collection = collection;
        this.key = key;
    }

    private void insertTestDataIntoMap(){
        textMap.put("Name", "Walter");
        textMap.put("SecondName", "White");
        textMap.put("Status", "Alive");
        textMap.put("Age", "50");
        textMap.put("Occupation", "Chemist");
        textMap.put("Location", "Albuquerque");
    }

    @Override
    public void run() {
        collection.add(textMap.get(key));
        System.out.println("Collection in class: " + collection);
    }
}
