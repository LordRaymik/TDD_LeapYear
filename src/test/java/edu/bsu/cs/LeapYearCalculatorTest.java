package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {

    @Test
    public void test2024 () {
        boolean result = LeapYearCalculator.isLeapYear(2024);
        Assertions.assertTrue(result);
    }

    @Test
    public void test2000 () {
        boolean result = LeapYearCalculator.isLeapYear(2000);
        Assertions.assertTrue(result);
    }

    @Test
    public void test2001 () {
        boolean result = LeapYearCalculator.isLeapYear(2001);
        Assertions.assertFalse(result);
    }
}