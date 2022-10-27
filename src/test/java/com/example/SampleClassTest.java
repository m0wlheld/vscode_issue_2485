package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleClassTest {

    @Test
    public void testHello() {
        assertEquals("Bonjour", new SampleClass().hello());
    }
}
