package org.example.Lab6;

import java.util.Objects;

public class ExampleEntity implements Comparable<ExampleEntity>{
    private String Name;
    private int Age;

    public ExampleEntity(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleEntity that = (ExampleEntity) o;
        return Age == that.Age && Name.equals(that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }

    @Override
    public String toString() {
        return "ExampleEntity{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int compareTo(ExampleEntity o) {
        if(this.Age < o.Age)
            return 1;
        else if (this.Age == o.Age)
            return 0;
        return -1;
    }
}
