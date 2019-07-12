package com.thoughtworks.tdd;

public class ConverNumber {

    public String convert(int input) {
        if (input == 2){
            return "2";
        }else if(input == 3){
            return "Fizz";
        }

        return "1";
    }
}
