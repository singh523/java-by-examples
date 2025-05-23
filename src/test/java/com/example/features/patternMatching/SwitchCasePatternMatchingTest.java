package com.example.features.patternMatching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchCasePatternMatchingTest {

    private final SwitchCasePatternMatching patternMatching = new SwitchCasePatternMatching();

    @Test
    public void testPatternMatching(){
        assertEquals( patternMatching.testPatternObjectType("yes"),"String");
        assertEquals( patternMatching.testPatternObjectType(12),"Integer");
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testPatternMatchingAll(Object obj, String expected ){
        assertEquals( patternMatching.testPatternObjectType(obj),expected);
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("test", "String"),
                Arguments.of(2, "Integer"),
                Arguments.of(3.3, "default")
        );
    }


}
