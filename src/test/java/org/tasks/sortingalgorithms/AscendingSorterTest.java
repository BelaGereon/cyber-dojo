package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tasks.sortingalgorithms.concretesorters.AscendingSorter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tasks.sortingalgorithms.TestHelper.fillListWithArrayElements;

public class AscendingSorterTest {
    private List<Integer> list;
    private List<Integer> expectedSortedList;
    private final Organizer organizer = new Organizer();
    final int[] testdata = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};
    final int[] expectedSortedTestdata = new int[]{-143, -2, 1, 8, 45, 87, 98, 435, Integer.MAX_VALUE};

    @BeforeEach
    void setup() {
        organizer.setSorter(new AscendingSorter());
    }

    @Test
    void shouldSortListAscending_whenCurrentSorter_IsAscendingSorter() throws EmptyListException {
        setupLists();

        final List<Integer> sortedList = organizer.sort(list);

        assertEquals(expectedSortedList, sortedList);
    }

    private void setupLists() {
        list = fillListWithArrayElements(testdata);
        expectedSortedList = fillListWithArrayElements(expectedSortedTestdata);
    }
}
