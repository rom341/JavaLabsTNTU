package org.example.Lab4;

public class YourPets {
    public static void main(String[] args) {
        Animal parrot = new Parrot("Charley", 0.792, true, 2);
        Animal cat = new Cat("Tom", 4.782, true, 8);
        Food wheatSeed = new Seed("Wheat seed", 0.005, false);
        parrot.eat(wheatSeed);
        cat.eat(parrot);
    }
}
