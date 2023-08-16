package org.tasks.calcstats;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Processor {
    private final Formatter formatter;

    public Processor(){
        this.formatter = new Formatter();
    }
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

    public double getAverageValue(int[] integers) {
        double sum = 0.0;
        for (int integer : integers) {
            sum += integer;
        }

        double average = sum / integers.length;
        return formatter.format(average);
    }
}
