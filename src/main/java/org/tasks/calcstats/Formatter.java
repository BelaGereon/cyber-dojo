package org.tasks.calcstats;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Formatter {

    public double format(double number) {
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.setScale(6, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
