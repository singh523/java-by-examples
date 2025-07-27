package com.example.features.mapstruct;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {

    private String firstName;
    private String lastName;
    private int age;
}
