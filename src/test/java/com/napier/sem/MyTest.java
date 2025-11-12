package com.napier.sem;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple unit tests from lab 06 to ensure unit tests are functioning properly
 */
class MyTest
{
    /**
     * test if the two numbers are equal
     */
    @Test
    void unitTest()
    {
        assertEquals(5, 5);
    }

    /**
     * test if the two strings are equal
     */
    @Test
    void unitTest2()
    {
        assertEquals("Hello World", "Hello World");
    }

    /**
     * test if the two numbers are equal and also show text if they are equal
     */
    @Test
    void unitTest3()
    {
        assertEquals(5, 5, "Messages are equal");
    }

    /**
     * test if the floating point numbers are equal within the range of 'delta'
     */
    @Test
    void unitTest4()
    {
        assertEquals(5.0, 5.01, 0.02);
    }

    /**
     * test if two arrays are equal
     */
    @Test
    void unitTest5()
    {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertArrayEquals(a, b);
    }

    /**
     * test if the statement is true
     */
    @Test
    void unitTest6()
    {
        assertTrue(5 == 5);
    }

    /**
     * test if the statement is false
     */
    @Test
    void unitTest7()
    {
        assertFalse(5 == 4);
    }

    /**
     * test if the value returns null
     */
    @Test
    void unitTest8()
    {
        assertNull(null);
    }

    /**
     * test if the value returns not null
     */
    @Test
    void unitTest9()
    {
        assertNotNull("Hello");
    }

    /**
     * test if a methods throws an exception
     */
    @Test
    void unitTest10()
    {
        assertThrows(NullPointerException.class, this::throwsException);
    }

    void throwsException() throws NullPointerException
    {
        throw new NullPointerException();
    }
}