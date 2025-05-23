package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumSourceTest {

    @ParameterizedTest
    @EnumSource(value = Color.class)
    void testEnumSource(Color c) {
        assertNotNull(c.name());
    }

    enum Color {
        RED, GREEN, BLUE
    }
}
