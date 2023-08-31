package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.Test;
import org.tasks.sortingalgorithms.concretesorters.AscendingSorter;
import org.tasks.sortingalgorithms.concretesorters.DescendingSorter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizerTest {

    private final Organizer organizer = new Organizer();
    private List<Integer> list = new ArrayList<>();
    private List<Integer> expectedSortedList;
    final int[] testdataArray = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};

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
    void shouldSortListAscending_whenCurrentSorter_IsAscendingSorter() throws EmptyListException {
        final int[] sortedTestdataArray = new int[]{-143, -2, 1, 8, 45, 87, 98, 435, Integer.MAX_VALUE};
        setupLists(sortedTestdataArray);
        organizer.setSorter(new AscendingSorter());

        final List<Integer> sortedList = organizer.sort(list);

        assertEquals(expectedSortedList, sortedList);
    }

    @Test
    void shouldSortListDescending_whenCurrentSorter_IsDescendingSorter() throws EmptyListException {
        final int[] sortedTestdataArray = new int[]{Integer.MAX_VALUE, 435, 98, 87, 45, 8, 1, -2, -143};
        setupLists(sortedTestdataArray);
        organizer.setSorter(new DescendingSorter());

        final List<Integer> sortedList = organizer.sort(list);

        assertEquals(expectedSortedList, sortedList);
    }

    private void setupLists(int[] sortedTestdataArray) {
        list = fillListWithArrayElements(testdataArray);
        expectedSortedList = fillListWithArrayElements(sortedTestdataArray);
    }

    private List<Integer> fillListWithArrayElements(int[] array) {
        List<Integer> filledList = new ArrayList<>();
        for (int element : array) {
            filledList.add(element);
        }
        return filledList;
    }
}
