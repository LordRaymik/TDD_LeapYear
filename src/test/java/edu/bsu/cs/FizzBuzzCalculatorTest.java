package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzCalculatorTest {

    @Test
    public void test1 () {
        String result = FizzBuzzCalculator.fizzBuzzResult(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void test3 () {
        String result = FizzBuzzCalculator.fizzBuzzResult(3);
        Assertions.assertEquals("fizz", result);
    }

    @Test
    public void test5 () {
        String result = FizzBuzzCalculator.fizzBuzzResult(5);
        Assertions.assertEquals("buzz", result);
    }

    @Test
    public void test15 () {
        String result = FizzBuzzCalculator.fizzBuzzResult(15);
        Assertions.assertEquals("fizzbuzz", result);
    }

}
