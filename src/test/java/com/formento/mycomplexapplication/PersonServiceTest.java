package com.formento.mycomplexapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @InjectMocks
    private PersonService personService;

    @Spy
    private PersonValidator personValidator;

    @Mock
    private PersonRepository personRepository;

    @Test
    public void shouldSavePerson() {
        // given
        final Person person = new Person("André Formento");

        // when
        doNothing().when(personValidator).validatePerson(person);
        final Person save = personService.save(person);

        // then
        assertNotNull(save);
        verify(personValidator).validatePerson(person);
    }

}
