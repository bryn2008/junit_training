package com.farenda.junit;

import static org.junit.Assert.*;

import static java.util.Collections.emptyList;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void shouldAssertEquelsElements() {
        assertEquals(3, 3); // integers
        assertEquals(3.14, 3.14, 0.0001); // Compares doubles with delta!
        assertEquals("Java", "Java"); // Objects
        assertEquals("The descriptive messages!", 3, 3); // with message
    }

    @Test
    public void shouldAssertArrayEquality() {
        assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
        assertArrayEquals("Those tables!", new boolean[] { true }, new boolean[] { true });
    }

    @Test
    public void shouldShowInequality() {
        assertNotEquals(3, 2 + 2);
        assertNotEquals("Close, but no.", 3.14, 3.1415, 0.0001);
    }

    @Test
    public void shouldAssertBooleanResult() {
        assertTrue(emptyList().isEmpty());
        assertTrue("It should be empty", emptyList().isEmpty());
        
        assertFalse("Yoda".isEmpty());
        assertFalse("There shall only be one!", "Yoda".isEmpty());
    }
    
    @Test
    public void shouldTestNullness(){
        assertNull(null);
        assertNull("This one will have to be null", null);
        
        assertNotNull("Han Solo");
        assertNotNull("Should not happen!", new Object());
    }
    
    @Test
    public void shouldFindTheSameObject(){
        String jedi = "Luke S";
        assertSame("There is only one Jedi!", jedi, jedi);
        assertNotSame("These guys are diffrent!", new Object(), new Object());
    }

}