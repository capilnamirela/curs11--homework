package org.fasttrackit.curs11.homework11.exercices.ex23;

public class Person {
    private final String name;
    private final Integer age;
    private final String hairColour;

    public Person(String name, Integer age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String name() {
        return name;
    }

    public Integer age() {
        return age;
    }

    public String hairColour() {
        return hairColour;
    }

    @Override
    public String toString() {
        return "Name: %s, age: %s, hairColour: %s ".formatted(name, age, hairColour);
    }

}
