package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        Exception exception = assertThrows(EmptyListException.class, () -> organizer.sort(list));
        String actualErrorMessage = exception.getMessage();

        assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

    @Test
    void shouldReturnListImmediately_whenGivenListHasOnlyOneObject() throws EmptyListException {
        list.add(1);
        assertEquals(list, organizer.sort(list));
    }

    @Test
    void shouldSortListAscending() {
        final int[] testdataArray = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};
        final int[] sortedTestdataArray = new int[]{-143, -2, 1, 8, 45, 87, 98, 435, Integer.MAX_VALUE};

        list = fillListWithArrayElements(testdataArray);
        List<Integer> expectedSortedList = fillListWithArrayElements(sortedTestdataArray);

        final List<Integer> sortedList;

        try {
            sortedList = organizer.sort(list);
        } catch (EmptyListException e) {
            throw new RuntimeException(e);
        }

        assertEquals(expectedSortedList, sortedList);
    }

    @Test
    void shouldSortListDescending() {
        final int[] testdataArray = new int[]{8, 98, 1, 45, 435, -2, 87, -143, Integer.MAX_VALUE};
        list = fillListWithArrayElements(testdataArray);

        final int[] sortedTestdataArray = new int[]{Integer.MAX_VALUE, 435, 98, 87, 45, 8, 1, -2, -143};
        List<Integer> expectedSortedList = fillListWithArrayElements(sortedTestdataArray);

        final List<Integer> sortedList;
        try {
            sortedList = organizer.sort(list);
        } catch (EmptyListException e) {
            throw new RuntimeException(e);
        }

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
