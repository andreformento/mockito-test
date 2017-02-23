package com.formento.mycomplexapplication;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonValidatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @InjectMocks
    private PersonValidator personValidator;

    @Test
    public void shouldBeAValidatePerson() {
        // given
        final Person person = new Person("André Formento");

        // when..then
        personValidator.validatePerson(person);
    }

    @Test
    public void shouldNotBeAValidatePerson() {
        // given
        final Person person = new Person(null);

        // expected exception
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("You need put a person name :(");

        // when
        personValidator.validatePerson(person);
    }

}
