package org.example.Lab6_Updated;

public class Launch {
    public static void main(String[] args) {
        Demonstrator demonstrator = new Demonstrator();
        String delimiter = "===============================================";

        System.out.println(delimiter);
        demonstrator.DemonstrateArrayList();
        System.out.println(delimiter);

        System.out.println(delimiter);
        demonstrator.DemonstrateLinkedHashSet();
        System.out.println(delimiter);

        System.out.println(delimiter);
        demonstrator.DemonstrateSortedArrayList();
        System.out.println(delimiter);

        System.out.println(delimiter);
        demonstrator.DemonstrateTreeSet();
        System.out.println(delimiter);

        System.out.println(delimiter);
        demonstrator.DemonstrateHashMap();
        System.out.println(delimiter);
    }
}
