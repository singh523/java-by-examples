package com.example.features.patternMatching;

public class SwitchCasePatternMatching {
    public String testPatternObjectType(Object obj) {
        return switch(obj){
            case String s ->  "String";
            case Integer i -> "Integer";
            default ->  "default";
        };
    }
}
