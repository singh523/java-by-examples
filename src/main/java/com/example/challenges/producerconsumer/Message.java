package com.example.challenges.producerconsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

    private int id;
    private double data;
}
