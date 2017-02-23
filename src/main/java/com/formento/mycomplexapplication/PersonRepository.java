package com.formento.mycomplexapplication;

public class PersonRepository {

    public Person save(final Person person) {
        // save person in a database
        System.out.println(person);

        return person;
    }

}
