package org.tasks.calcstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterTest {

    Formatter formatter = new Formatter();

    @Test
    void shouldRoundToLowerDecimal_when7thDecimalIsSmallerThan5() {
        // given
        double someNumber = 1.444_444_444;

        // when
        double formattedNumber = formatter.format(someNumber);
        
        // then
        assertEquals(1.444444, formattedNumber);
    }

    @Test
    void shouldRoundToHigherDecimal_when7thDecimalIsBiggerThan5() {
        // given
        double someNumber = 0.123_456_789;

        // when
        double formattedNumber = formatter.format(someNumber);

        // then
        assertEquals(0.123457, formattedNumber);
    }

    @Test
    void shouldRoundToHigherDecimal_when7thDecimalEquals5() {
        // given
        double someNumber = 0.987_654_514;

        // when
        double formattedNumber = formatter.format(someNumber);

        // then
        assertEquals(0.987655, formattedNumber);
    }

    @Test
    void shouldKeepNumberOfDecimals_whenThereAreLessThan6() {
        // given
        double someNumber = 1.234;

        // when
        double formattedNumber = formatter.format(someNumber);

        // then
        assertEquals(1.234, formattedNumber);
    }
    
}
