package com.hlf.javaeuler.euler5;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Howard.Fackrell
 * Date: 9/13/13
 * Time: 9:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler5Test {
    @Test
    public void testSmallestCommonMultiple() throws Exception {
        Euler5 euler5 = new Euler5();


        int[] factors = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(euler5.smallestCommonMultiple(factors), 2520, "Smallest common multiple of [1-10] should be 2520");

        int[] smallerFactors = {1, 2, 3};
        assertEquals(euler5.smallestCommonMultiple(smallerFactors), 6, "Smallest common multiple of [1-3] should be 6");
    }
}
