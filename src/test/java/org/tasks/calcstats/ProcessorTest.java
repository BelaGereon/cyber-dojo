package org.tasks.calcstats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessorTest {

    private Processor processor;

    @BeforeEach
    void setup() {
        processor = new Processor();
    }
    @Test
    void shouldBeAbleToDetermineMinimumValue() {
        // given
        int[] integers1 = {3, 2, 1};
        int[] integers2 = {10, 11, 12};

        int smallestInteger1 = processor.getMinValue(integers1);
        int smallestInteger2 = processor.getMinValue(integers2);

        assertEquals(1, smallestInteger1);
        assertEquals(10, smallestInteger2);
    }

}
