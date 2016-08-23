package com.formento.mockito.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class PersonServiceTest {

    private PersonValidator personValidator;
    private PersonService personService;

    @Before
    public void init() {
        personValidator = mock(PersonValidator.class);
        personService = new PersonService(personValidator);
    }

    @Test
    public void shouldSavePerson() {
        // given
        Person person = new Person("André Formento");

        // when
//        Mockito.doNothing().when(personValidator).validatePerson(person);
        Person save = personService.save(person);

        // then
        assertNotNull(save);
    }

}