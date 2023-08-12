package org.tasks.calcstats;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Formatter {

    private final String pattern;
    private final DecimalFormat df;

    public Formatter(){
        this.pattern = "#.######";
        this.df = new DecimalFormat(pattern);
    }
    public float format(float number) {
        df.setRoundingMode(RoundingMode.HALF_UP);

        return Float.parseFloat(df.format(number));
    }

    public String getPattern() {
        return this.pattern;
    }
}
