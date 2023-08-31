package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tasks.sortingalgorithms.concretesorters.DescendingSorter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tasks.sortingalgorithms.TestHelper.fillListWithArrayElements;

public class DescendingSorterTest {
    private List<Integer> list;
    private List<Integer> expectedSortedList;
    private final Organizer organizer = new Organizer();
    final int[] testdata = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};
    final int[] expectedSortedTestdata = new int[]{Integer.MAX_VALUE, 435, 98, 87, 45, 8, 1, -2, -143};

    @BeforeEach
    void setup() {
        organizer.setSorter(new DescendingSorter());
    }

    @Test
    void shouldSortListDescending_whenCurrentSorter_IsDescendingSorter() throws EmptyListException {
        setupLists();

        final List<Integer> sortedList = organizer.sort(list);

        assertEquals(expectedSortedList, sortedList);
    }

    private void setupLists() {
        list = fillListWithArrayElements(testdata);
        expectedSortedList = fillListWithArrayElements(expectedSortedTestdata);
    }
}
