package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MultiFieldArgsTest {

    @ParameterizedTest
    @FieldSource("stringIntAndListArguments")
    public void testMultiFieldArgs(String str, int num, List<String> list){
        assertEquals(5, str.length());
        assertTrue(num >=1 && num <= 2);
    }

    static List<Arguments> stringIntAndListArguments = Arrays.asList(
            arguments("apple", 1, Arrays.asList("0", "b")),
            arguments("lemon", 2, Arrays.asList("aasdf", "asdfb")));
}
