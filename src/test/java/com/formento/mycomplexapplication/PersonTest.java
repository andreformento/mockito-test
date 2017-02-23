package com.formento.mycomplexapplication;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {

    @Test
    public void shouldConfigureAPersonName() {
        // given
        final String name = "André Formento";

        // when
        final Person person = new Person(name);

        // then
        assertNotNull(person);
        assertEquals(name, person.getName());
    }

    @Test
    public void shouldDoSomething() {
        // given
        final String name = "André Formento";

        // when
        final Person person = new Person(name);

        // then
        person.doSomethingWithoutReturn(1, "a");
    }

    @Test
    public void shouldFormatName() {
        // given
        final String name = "André Formento";

        // when
        final String toString = new Person(name).toString();

        // then
        assertEquals("Name: " + name, toString);
    }

    @Test
    public void shouldVerifyContractOfEqualsAndHashCode() {
        EqualsVerifier.forClass(Person.class).verify();
    }

}
