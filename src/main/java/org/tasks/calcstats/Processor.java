package org.tasks.calcstats;

import java.math.RoundingMode;
import java.text.DecimalFormat;

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

    public double getAverageValue(int[] integers) {
        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.HALF_UP);

        double sum = 0.0;
        for (int integer : integers) {
            sum += integer;
        }

        double average = sum / integers.length;
        return Double.parseDouble(df.format(average));
    }
}
