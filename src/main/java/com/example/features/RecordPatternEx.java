package com.example.features;


public class RecordPatternEx {

    public String getFullName(Object obj) {

        if (obj instanceof Person(String firstName, String lastName, int age)) {
            return STR."\{firstName} \{lastName}";
        }
        return null;
    }
}

