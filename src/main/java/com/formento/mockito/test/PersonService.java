package com.formento.mockito.test;

public class PersonService {

    private final PersonValidator personValidator;

    public PersonService(PersonValidator personValidator) {
        this.personValidator = personValidator;
    }

    public Person save(Person person) {
        personValidator.validatePerson(person);

        // save person in a database
        System.out.println(person);

        // return a saved person
        return person;
    }

}
