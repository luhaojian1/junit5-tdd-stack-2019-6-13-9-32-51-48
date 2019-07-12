package com.thoughtworks.tdd;


public class ConverNumber {

    public String convert(int input) {

        if (input % 3 == 0) {
            return "Fizz";
        }else if(input % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
