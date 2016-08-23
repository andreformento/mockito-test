package com.formento.mockito.test;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSomethingWithoutReturn(Integer value, String description) {
        System.out.println("value: " + value + "; description:" + description);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
    
}
