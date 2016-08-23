package com.formento.mockito.test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonValidatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PersonValidator personValidator;

    @Before
    public void init() {
        this.personValidator = new PersonValidator();
    }

    @Test
    public void shouldBeAValidatePerson() {
        // given
        Person person = new Person("André Formento");

        // when..then
        personValidator.validatePerson(person);
    }

    @Test
    public void shouldNotBeAValidatePerson() {
        // given
        Person person = new Person(null);

        // then
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("You need put a name in a person :(");

        // when
        personValidator.validatePerson(person);
    }

}