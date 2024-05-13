package org.example.Lab6;

public class Launch {
    public static void main(String[] args) {
        Demonstrator demonstrator = new Demonstrator();
        String delimetr = "===============================================";

        System.out.println(delimetr);
        demonstrator.DemonstrateHashSet();
        System.out.println(delimetr);

        System.out.println(delimetr);
        demonstrator.DemonstrateTreeSet();
        System.out.println(delimetr);

        System.out.println(delimetr);
        demonstrator.DemonstrateTreeMap();
        System.out.println(delimetr);

        System.out.println(delimetr);
        demonstrator.DemonstrateLinkedList();
        System.out.println(delimetr);

        System.out.println(delimetr);
        demonstrator.DemonstrateArrayList();
        System.out.println(delimetr);

        System.out.println(delimetr);
        demonstrator.DemonstrateQueue();
        System.out.println(delimetr);

        System.out.println(delimetr);
        demonstrator.DemonstratePriorityQueue();
        System.out.println(delimetr);
    }
}
