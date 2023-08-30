package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tasks.sortingalgorithms.concretesorters.AscendingSorter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizerTest {

    private final Organizer organizer = new Organizer();
    private List<Integer> list;

    @BeforeEach
    void setup() {
        list = new ArrayList<>();
    }

    @Test
    void shouldReturnNoElementsException_whenGivenListIsEmpty() {
        String expectedErrorMessage = "The list is empty and can not be sorted!";
        organizer.setSorter(new AscendingSorter());

        Exception exception = assertThrows(EmptyListException.class, () -> organizer.sort(list));
        String actualErrorMessage = exception.getMessage();

        assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

    @Test
    void shouldReturnListImmediately_whenGivenListHasOnlyOneObject() throws EmptyListException {
        organizer.setSorter(new AscendingSorter());

        list.add(1);
        assertEquals(list, organizer.sort(list));
    }

    @Test
    void shouldSortListAscending() throws EmptyListException {
        final int[] testdataArray = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};
        final int[] sortedTestdataArray = new int[]{-143, -2, 1, 8, 45, 87, 98, 435, Integer.MAX_VALUE};

        organizer.setSorter(new AscendingSorter());

        list = fillListWithArrayElements(testdataArray);
        List<Integer> expectedSortedList = fillListWithArrayElements(sortedTestdataArray);

        final List<Integer> sortedList;
        sortedList = organizer.sort(list);

        assertEquals(expectedSortedList, sortedList);
    }

    private List<Integer> fillListWithArrayElements(int[] array) {
        List<Integer> filledList = new ArrayList<>();
        for (int element : array) {
            filledList.add(element);
        }
        return filledList;
    }
}
