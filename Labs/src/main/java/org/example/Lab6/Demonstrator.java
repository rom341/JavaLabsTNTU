package org.example.Lab6;

import java.util.*;
import java.util.random.RandomGenerator;

public class Demonstrator {
    private final String[] PossibleNames;
    public Demonstrator(){
        PossibleNames = new String[]{
                "Roman", "Denis", "Tom", "Oleg", "Tom", "Jackson", "Michael",
                "Viktoria", "Violeta", "Oleksandra", "Alina", "Eva", "Diana"
        };
    }
    public Demonstrator(String[] possibleNames) {
        PossibleNames = possibleNames;
    }

    private ExampleEntity GenerateExampleEntityValue(){
        Random random = new Random();

        int randomNameIndex = random.nextInt(PossibleNames.length);
        String Name = PossibleNames[randomNameIndex];
        int Age = random.nextInt(100);

        return new ExampleEntity(Name, Age);
    }
    public void DemonstrateHashSet(){
        System.out.println("HashSet Demonstration\n");
        HashSet<ExampleEntity> entityHashSet = new HashSet<>();
        ExampleEntity generatedEntity = GenerateExampleEntityValue();
        System.out.printf(
                "Proving, that HashCode generates same value for same objects: \n" +
                "Entity: %s\nFirst gen: %d\n" +
                "Second gen: %d\n\n",
                generatedEntity, generatedEntity.hashCode(), generatedEntity.hashCode());

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: %s\tWith HashCode: %d\n", generatedEntity, generatedEntity.hashCode());
            entityHashSet.add(generatedEntity);
        }

        System.out.printf("\nHashSet values: \n%s\n", entityHashSet);
    }

    public void DemonstrateTreeSet(){
        System.out.println("TreeSet Demonstration\n");
        TreeSet<ExampleEntity> entityTreeSet = new TreeSet<ExampleEntity>();
        ExampleEntity generatedEntity;

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: %s\n", generatedEntity);
            entityTreeSet.add(generatedEntity);
        }
        System.out.printf("\nGenerated TreeSet: \n%s\n", entityTreeSet);

        ExampleEntity firstEntity =  entityTreeSet.first();
        ExampleEntity secondEntity = entityTreeSet.higher(firstEntity);
        System.out.printf("\ncompareTo demonstration: \n" +
                        "(comparing by age)\n" +
                        "%s compareTo %s\nResult: %d\n",
                firstEntity, secondEntity, firstEntity.compareTo(secondEntity));
    }
    public void DemonstrateTreeMap(){
        System.out.println("TreeMap Demonstration\n");
        TreeMap<Integer, ExampleEntity>  entityTreeMap = new TreeMap<>();

        ExampleEntity generatedEntity;

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: Key: %d \t Value: %s\n", i, generatedEntity);
            entityTreeMap.put(i, generatedEntity);
        }
        System.out.printf("\nGenerated TreeMap: \n%s\n", entityTreeMap);

        System.out.printf("\nValue with key='3': %s\n", entityTreeMap.get(3));
    }

    public void DemonstrateLinkedList(){
        System.out.println("LinkedList Demonstration\n");
        LinkedList<ExampleEntity> entityLinkedList = new LinkedList<>();

        ExampleEntity generatedEntity;

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: %s\n", generatedEntity);
            entityLinkedList.add(generatedEntity);
        }

        System.out.printf("\nGenerated LinkedList: \n%s\n", entityLinkedList);
    }

    public void DemonstrateArrayList(){
        System.out.println("ArrayList Demonstration\n");
        ArrayList<ExampleEntity> entityArrayList = new ArrayList<>();
        ExampleEntity generatedEntity;

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: %s\n", generatedEntity);
            entityArrayList.add(generatedEntity);
        }

        System.out.printf("\nGenerated ArrayList: \n%s\n", entityArrayList);
    }

    public void DemonstrateQueue() {
        System.out.println("Queue Demonstration\n");
        Queue<ExampleEntity> entityQueue = new LinkedList<>();
        ExampleEntity generatedEntity;

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: %s\n", generatedEntity);
            entityQueue.add(generatedEntity);
        }

        System.out.println();

        while (!entityQueue.isEmpty()) {
            System.out.printf("Entity dequeued: %s\n", entityQueue.poll());
        }

        System.out.println();
    }

    public void DemonstratePriorityQueue() {
        System.out.println("Queue Demonstration\n");
        Queue<ExampleEntity> entityPriorityQueue = new PriorityQueue<>();
        ExampleEntity generatedEntity;

        for(int i = 0; i < 10; i++){
            generatedEntity = GenerateExampleEntityValue();
            System.out.printf("Entity created: %s\n", generatedEntity);
            entityPriorityQueue.add(generatedEntity);
        }

        System.out.println();

        while (!entityPriorityQueue.isEmpty()) {
            System.out.printf("Entity dequeued: %s\n", entityPriorityQueue.poll());
        }

        System.out.println("\nHigher age = higher priority");
    }
}
