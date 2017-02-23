package com.formento.mycomplexapplication;

import java.util.Objects;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSomethingWithoutReturn(Integer value, String description) {
        System.out.println("Person: " + name + "; value: " + value + "; description:" + description);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }

        final Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(name);
    }

}
