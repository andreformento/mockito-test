package com.formento.mockito.test;

import java.util.Optional;

public class PersonValidator {

    public void validatePerson(Person person) {
        Optional.ofNullable(person.getName()).orElseThrow(() -> new NullPointerException("You need put a name in a person :("));
    }

}
