package org.tasks.calcstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterTest {

    String pattern = "#.######";
    Formatter formatter = new Formatter(pattern);
    @Test
    void shouldHaveCorrectDecimalFormat_whenInitialized() {
        // when
        String decimalFormat = formatter.getPattern();

        // then
        assertEquals("#.######", decimalFormat);
    }

    @Test
    void shouldRoundToLowerDecimal_whenLastDecimalIsSmallerThan5() {
        // given
        float someNumber = 1.4444444444F;

        // when
        float formattedNumber = formatter.format(someNumber);
        
        // then
        assertEquals(1.444444F, formattedNumber);
    }

    @Test
    void shouldRoundToHigherDecimal_whenLastDecimalIsBiggerThan5() {
        // given
        float someNumber = 0.1234567F;

        // when
        float formattedNumber = formatter.format(someNumber);

        // then
        assertEquals(0.123457F, formattedNumber);
    }

    @Test
    void shouldRoundToHigherDecimal_whenLastDecimalIs5() {
        // given
        float someNumber = 0.9876545F;

        // when
        float formattedNumber = formatter.format(someNumber);

        // then
        assertEquals(0.987655F, formattedNumber);
    }

    @Test
    void shouldKeepNumberOfDecimals_whenThereAreLessThan6() {
        // given
        float someNumber = 1.2345F;

        // when
        float formattedNumber = formatter.format(someNumber);

        // then
        assertEquals(someNumber, formattedNumber);
    }
    
}
