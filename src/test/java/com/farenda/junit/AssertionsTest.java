package com.farenda.junit;

import static org.junit.Assert.*;

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
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1,2,3});
        assertArrayEquals("Those tables!", new boolean[]{true}, new boolean[]{true});
    }
    
    @Test
    public void shouldShowInequality(){
        assertNotEquals(3,2+2);
    }

}