package org.tasks.calcstats;

public class Statistic {

    private final Processor processor;

    public Statistic() {
        this.processor = new Processor();
    }
    public String getStatistic(int[] sequence) {
        int minimumValue = processor.getMinValue(sequence);
        int maximumValue = processor.getMaxValue(sequence);
        int elements = processor.getNumberOfElements(sequence);
        double average = processor.getAverageValue(sequence);

        return getFormattedStatisticOutputText(minimumValue, maximumValue, elements, average);
    }

    private static String getFormattedStatisticOutputText(
            int minimumValue,
            int maximumValue,
            int elements,
            double average) {
        return """
                o) minimum value = %s
                o) maximum value = %s
                o) number of elements in the sequence = %s
                o) average value = %s
                """.formatted(minimumValue, maximumValue, elements, average);
    }
}
