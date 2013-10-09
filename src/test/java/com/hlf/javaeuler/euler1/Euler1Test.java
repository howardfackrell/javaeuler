package com.hlf.javaeuler.euler1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Howard.Fackrell
 * Date: 9/13/13
 * Time: 9:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler1Test {
    @Test
    public void testFindMultiplesBelow() throws Exception {
        Euler1 euler1 = new Euler1();
        assertEquals(euler1.findMultiplesBelow(10, 3, 5), 23, "Multiples of 3 and 5 below 10 should sum up to 23");
        assertEquals(euler1.findMultiplesBelow(20, 3, 5), 78, "Multiples of 3 and 5 below 20 should sum up to 78");
        assertEquals(euler1.findMultiplesBelow(0, 3, 5), 0, "Multiples of 3 and 5 below 20 should sum up to 0");
    }
}
