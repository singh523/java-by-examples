package com.example.features;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        System.out.println("Stream Example");

        List<String> list = List.of("john", "jenny", "Testing", "Test");

        list.stream()
            .filter(s -> s.startsWith("T"))
            .forEach(System.out::println);

    }
}
