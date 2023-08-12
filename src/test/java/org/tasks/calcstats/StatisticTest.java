package org.tasks.calcstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticTest {

    @Test
    void shouldReturnTheCorrectStatistic() {
       // given
       Statistic statistic = new Statistic();
       int[] sequence = { 6, 9, 15, -2, 92, 11 };
       String expectedStatistics =
               """
               o) minimum value = -2
               o) maximum value = 92
               o) number of elements in the sequence = 6
               o) average value = 21.833333
               """;

       // when
       String statistics = statistic.getStatistic(sequence);

       // then
       assertEquals(expectedStatistics, statistics);
    }

}
