package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.tasks.sortingalgorithms.concretesorters.CharSorter;

import java.util.List;

import static org.tasks.sortingalgorithms.TestHelper.fillListWithArrayElements;

public class CharSorterTest {

    private List<Integer> list;
    private List<Integer> expectedSortedList;
    private final Organizer organizer = new Organizer();
    final int[] testdata = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};
    final int[] expectedSortedTestdata = new int[]{1, 8, -2, 45, 87, 98, 435, -143, Integer.MAX_VALUE};

    @BeforeEach
    void setup() {
        organizer.setSorter(new CharSorter());
    }

    private void setupLists() {
        list = fillListWithArrayElements(testdata);
        expectedSortedList = fillListWithArrayElements(expectedSortedTestdata);
    }

}
