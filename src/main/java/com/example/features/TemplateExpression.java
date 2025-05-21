package com.example.features;

import static java.lang.StringTemplate.RAW;

public class TemplateExpression {

    public static void main(String[] args) {
        StringTemplate message = RAW."Welcome to \{getProgrammingLanguage()} ";
        System.out.println(STR.process(message));
    }
    static String getProgrammingLanguage(){
        return "Java";
    }
}
