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

}
