package org.example.Lab4;

public abstract class Animal extends Food{
    private String name;
    private int age;

    public void eat(Food food)
    {
        System.out.println(name + " is eating" + food);
    }
    public Animal()
    {

    }

    public Animal(String name, double mass, boolean isMeat, int age) {
        super(name, mass, isMeat);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
