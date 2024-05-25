package org.example.Lab6_Updated;

import java.util.*;

public class Demonstrator {
    private final List<Animal> animals;

    public Demonstrator() {
        animals = generateAnimalList();
    }

    private List<Animal> generateAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        String[] names = {"Lion", "Tiger", "Elephant", "Giraffe", "Zebra", "Monkey", "Panda", "Kangaroo", "Koala", "Cheetah"};

        Random random = new Random();

        for (String name : names) {
            int age = random.nextInt(20);
            animalList.add(new Animal(name, age));
        }
        //inserting dublicates
        animalList.add(animalList.get(0));
        animalList.add(animalList.get(1));
        animalList.add(animalList.get(0));
        return animalList;
    }

    public void DemonstrateArrayList() {
        System.out.println("ArrayList Demonstration\n");
        List<Animal> animalArrayList = new ArrayList<>(animals);
        for (Animal animal : animalArrayList) {
            System.out.println(animal);
        }
        System.out.printf("\nGenerated ArrayList: \n%s\n", animalArrayList);
    }

    public void DemonstrateLinkedHashSet() {
        System.out.println("LinkedHashSet Demonstration\n");
        Set<Animal> animalLinkedHashSet = new LinkedHashSet<>(animals);
        for (Animal animal : animalLinkedHashSet) {
            System.out.println(animal);
        }
        System.out.printf("\nGenerated LinkedHashSet: \n%s\n", animalLinkedHashSet);
    }

    public void DemonstrateSortedArrayList() {
        System.out.println("Sorted ArrayList Demonstration\n");
        List<Animal> animalArrayList = new ArrayList<>(animals);
        Collections.sort(animalArrayList);
        for (Animal animal : animalArrayList) {
            System.out.println(animal);
        }
        System.out.printf("\nSorted ArrayList: \n%s\n", animalArrayList);
    }

    public void DemonstrateTreeSet() {
        System.out.println("TreeSet Demonstration\n");
        Set<Animal> animalTreeSet = new TreeSet<>(animals);
        for (Animal animal : animalTreeSet) {
            System.out.println(animal);
        }
        System.out.printf("\nGenerated TreeSet: \n%s\n", animalTreeSet);
    }

    public void DemonstrateHashMap() {
        System.out.println("HashMap Demonstration\n");
        Map<Integer, Animal> animalHashMap = new HashMap<>();
        int id = 1;

        for (Animal animal : animals) {
            animalHashMap.put(animal.getAge(), animal);
            System.out.printf("Entity added: Key (age): %d \t Value (animal): %s\n", animal.getAge(), animal);
        }
        System.out.printf("\nGenerated HashMap: \n%s\n", animalHashMap);
    }
}