package com.formento.mockito.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {

    @Test
    public void shouldConfigureAPersonName() {
        // given
        String name = "André Formento";

        // when
        Person person = new Person(name);

        // then
        assertNotNull(person);
        assertEquals(name, person.getName());
    }

    @Test
    public void shouldDoSomething() {
        // given
        String name = "André Formento";

        // when
        Person person = new Person(name);

        // then
        person.doSomethingWithoutReturn(1, "a");
    }

    @Test
    public void shouldFormatName() {
        // given
        String name = "André Formento";

        // when
        String toString = new Person(name).toString();

        // then
        assertEquals("Name: " + name, toString);
    }

}
