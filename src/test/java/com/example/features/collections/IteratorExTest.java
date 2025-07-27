package com.example.features.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorExTest {


    @Test
    public void testIteratorEx(){
        IteratorEx iteratorEx = new IteratorEx();
        List<String> itemRemovedList = iteratorEx.removeItemFromList(Arrays.asList("one", "two", "three", "four", "five"), "two");
        assertEquals(itemRemovedList, Arrays.asList("one", "three", "four", "five"));
    }

}
