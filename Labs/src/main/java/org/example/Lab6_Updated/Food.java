package org.example.Lab6_Updated;

public abstract class Food {
    private String name;
    private double mass;
    private boolean isMeat;

    public Food(){}

    public Food(String name, double mass, boolean isMeat) {
        this.name = name;
        this.mass = mass;
        this.isMeat = isMeat;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
