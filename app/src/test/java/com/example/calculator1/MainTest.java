package com.example.calculator1;

import org.junit.Test;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * local unit test, which will execute on the development machine (host).
 *
 *
 */
public class MainTest {

    /** This test method is for testing Addition method of the calculator
    *
    */

    @Test
    public void testAddReturnTrue() {

        assertEquals(10.1, MainActivity.add(1.0,9.1),0);
        assertEquals(1, MainActivity.add(1,0),0);
        assertEquals(0.2, MainActivity.add(0.1,0.1),0);
    }

    /** This test method is for testing Subtraction method of the calculator
    *
    */

    @Test
    public void testSubReturnTrue() {

        assertEquals(-90, MainActivity.sub(10,100),0);
        assertEquals(-1, MainActivity.sub(0,1),0);
        assertEquals(101.1, MainActivity.sub(102,0.9),0);
    }
    /** This test method is for testing Multiplication method of the calculator
    *
    */
    @Test
    public void testMultiplyReturnTrue() {

        assertEquals(50, MainActivity.mul(5,10),0);
        assertEquals(250000, MainActivity.mul(500,500),0);
        assertEquals(0, MainActivity.mul(0,10),0);
    }

    /** This test method is for testing Division method of the calculator
    *
    */
    @Test
    public void testDivisionReturnTrue() {

        assertEquals(2.5, MainActivity.div(5,2),0);
        assertEquals(10, MainActivity.div(100,10),0);
        assertEquals(0, MainActivity.div(0,1),0);
    }
}