package org.tasks.calcstats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessorTest {

    private Processor processor;
    int[] integers1;
    int[] integers2;

    @BeforeEach
    void setup() {
        processor = new Processor();
        integers1 = new int[]{6, 9, 15, -2, 92, 11};
        integers2 = new int[]{1, 2, 3, 4, 5, 6};

    }
    @Test
    void shouldBeAbleToDetermineMinimumValue_whenDifferentInputsAreProvided() {
        int smallestInteger1 = processor.getMinValue(integers1);
        int smallestInteger2 = processor.getMinValue(integers2);

        assertEquals(-2, smallestInteger1);
        assertEquals(1, smallestInteger2);
    }

    @Test
    void shouldBeAbleToDetermineMaximumValue_whenDifferentInputsAreProvided() {
        int biggestInteger1 = processor.getMaxValue(integers1);
        int biggestInteger2 = processor.getMaxValue(integers2);

        assertEquals(92, biggestInteger1);
        assertEquals(6, biggestInteger2);
    }

}
