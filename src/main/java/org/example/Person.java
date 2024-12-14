package org.example;

import java.util.Comparator;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;  //downcasting to use Person as an object (basically Object is the superclass of all objects in Java and Person class is derived from Object) by downcasting we can use Object class methods such as equals() and hashcode
        return age == person.age && name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
