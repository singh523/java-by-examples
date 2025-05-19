package com.example.features;

import static java.util.FormatProcessor.FMT;

public class FMTTemplateProcessor {

    public static void main(String[] args) {
        System.out.println("FMT Template Processor");
        System.out.println(interpolationOfJSONBlockWithFMT("Test user", "USA", 4000.0f, "M"));
    }

    static String interpolationOfJSONBlockWithFMT(String name, String address, float salary, String gender) {
        return FMT
                . """
      {
        "name": "%1s\{ name }",
        "address": "%1s\{address}
        "salary": "%2.2f\{ salary }",
        "gender": "%1s\{ gender }"
      }
      """ ;
    }
}
