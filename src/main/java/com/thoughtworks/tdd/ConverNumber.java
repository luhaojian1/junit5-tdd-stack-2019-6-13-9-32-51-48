package com.thoughtworks.tdd;


public class ConverNumber {

    public String convert(int input) {

        if (input == 3 || input == 6) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
