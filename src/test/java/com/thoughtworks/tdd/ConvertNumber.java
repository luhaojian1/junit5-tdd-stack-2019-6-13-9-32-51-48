package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertNumber {
    @Test
    void should_return_1_when_convent_given_1(){
        //given
        int input = 1;
        //when
        String result = new ConverNumber().convert(input);
        //then
        assertEquals("1",result);
    }

    @Test
    void should_return_2_when_convent_given_2(){
        //given
        int input = 2;
        //when
        String result = new ConverNumber().convert(input);
        //then
        assertEquals("2",result);
    }

    @Test
    void should_return_Fizz_when_convent_given_3(){
        //given
        int input = 3;
        //when
        String result = new ConverNumber().convert(input);
        //then
        assertEquals("Fizz",result);
    }

    @Test
    void should_return_Fizz_when_convent_given_6(){
        //given
        int input = 6;
        //when
        String result = new ConverNumber().convert(input);
        //then
        assertEquals("Fizz",result);
    }
}
