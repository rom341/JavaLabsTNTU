package org.example.Lab4;

public abstract class Herbivore extends Animal{
    public Herbivore() {
        super();
    }


    public Herbivore(String name, double mass, boolean isMeat, int age) {
        super(name, mass, isMeat, age);
    }

    @Override
    public void eat(Food food)
    {
        if(!food.isMeat())
            System.out.println("Herbivore " + getName() + " is eating " + food.getName());
        else
            System.out.println("Herbivore cant eat " + food.getName());
    }
}
