package org.example.Lab4;

public abstract class Predator extends Animal{
    public Predator() {
    }

    public Predator(String name, double mass, boolean isMeat, int age) {
        super(name, mass, isMeat, age);
    }

    @Override
    public void eat(Food food)
    {
        if(food.isMeat())
            System.out.println("Predator " + getName() + " is eating " + food.getName());
        else
            System.out.println("Predator cant eat " + food.getName());
    }
}
