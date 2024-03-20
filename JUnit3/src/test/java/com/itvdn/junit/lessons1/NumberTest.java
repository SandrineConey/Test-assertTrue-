package com.itvdn.junit.lessons1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void sum() {
        Number numbers = new Number();
        int actual = numbers.sum(5);
        int expected = 15;
        assertTrue(expected == actual);
    }
}