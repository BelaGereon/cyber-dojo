package org.tasks.calcstats;

public class Processor {
    public int getMinValue(int[] integers) {
        int minValue = integers[0];
        for (int integer : integers) {
            if (integer < minValue) {
                minValue = integer;
            }
        }
        return minValue;
    }
}
