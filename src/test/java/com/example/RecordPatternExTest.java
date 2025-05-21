package com.example;

import com.example.features.Person;
import com.example.features.RecordPatternEx;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecordPatternExTest {

    private RecordPatternEx recordPatterEx = new RecordPatternEx();

    @Test
    public void testRecordPatternEx() {
        Person person = new Person("Morris", "Ray", 30);
        Assertions.assertThat("Morris Ray".equals(recordPatterEx.getFullName(person)));
    }
}
