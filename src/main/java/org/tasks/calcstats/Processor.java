package org.tasks.calcstats;

public class Processor {
    public int getMinValue(int[] integers) {
        int minValue = integers[0];
        for (int integer : integers)
            if (integer < minValue) minValue = integer;
        return minValue;
    }

    public int getMaxValue(int[] integers) {
        int maxValue = integers[0];
        for (int integer : integers)
            if (integer > maxValue) maxValue = integer;
        return maxValue;
    }

    public int getNumberOfElements(int[] ints) {
        return ints.length;
    }
}
