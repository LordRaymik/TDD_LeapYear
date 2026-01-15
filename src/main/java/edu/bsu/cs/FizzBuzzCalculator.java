package edu.bsu.cs;

public class FizzBuzzCalculator {

    public static String fizzBuzzResult (int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "fizz";
        }
        if (number % 5 == 0) {
            result += "buzz";
        }
        if (result.isEmpty()) {
            result = String.valueOf(number);
        }
        return result;
    }

}