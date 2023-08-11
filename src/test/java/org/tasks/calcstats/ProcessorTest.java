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
        integers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }
    @Test
    void shouldBeAbleToDetermineMinimumValue() {
        int smallestInteger1 = processor.getMinValue(integers1);
        int smallestInteger2 = processor.getMinValue(integers2);

        assertEquals(-2, smallestInteger1);
        assertEquals(1, smallestInteger2);
    }

    @Test
    void shouldBeAbleToDetermineMaximumValue() {
        int biggestInteger1 = processor.getMaxValue(integers1);
        int biggestInteger2 = processor.getMaxValue(integers2);

        assertEquals(92, biggestInteger1);
        assertEquals(10, biggestInteger2);
    }

    @Test
    void shouldBeAbleToReturnNumberOfIntegersInArray() {
        int elementsInIntegers1 = processor.getNumberOfElements(integers1);
        int elementsInIntegers2 = processor.getNumberOfElements(integers2);

        assertEquals(10, elementsInIntegers2);
        assertEquals(6, elementsInIntegers1);
    }

    @Test
    void shouldBeAbleToDetermineTheAverageValue() {
       double averageOfIntegers1 = processor.getAverageValue(integers1);
       double averageOfIntegers2 = processor.getAverageValue(integers2);

        assertEquals(21.833333, averageOfIntegers1);
        assertEquals(5.5, averageOfIntegers2);
    }

}
