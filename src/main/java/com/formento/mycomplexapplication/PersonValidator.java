package com.formento.mycomplexapplication;

import java.util.Optional;

public class PersonValidator {

    public void validatePerson(Person person) {
        Optional.ofNullable(person.getName()).orElseThrow(() -> new NullPointerException("You need put a person name :("));
    }

}
