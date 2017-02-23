package com.formento.mycomplexapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class PersonRepositoryTest {

    @InjectMocks
    private PersonRepository personRepository;

    @Test
    public void shouldSaveOnDatabase() {
        // given
        final Person person = new Person("André Formento");

        // when
        final Person result = personRepository.save(person);

        // then
        assertNotNull(result);
    }

}
