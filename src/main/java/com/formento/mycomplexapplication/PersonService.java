package com.formento.mycomplexapplication;

public class PersonService {

    private final PersonValidator validator;
    private final PersonRepository repository;

    public PersonService(PersonValidator validator, PersonRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }

    public Person save(Person person) {
        validator.validatePerson(person);

        repository.save(person);

        // return a saved person
        return person;
    }

}
