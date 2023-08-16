package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizerTest {

    @Test
    void shouldReturnNoElementsException_whenGivenListIsEmpty() {
        final List<Integer> emptyList = new ArrayList<>();
        Organizer organizer = new Organizer();

        Exception exception = assertThrows(EmptyListException.class, () -> organizer.sort(emptyList));

        String expectedErrorMessage = "The list is empty and can not be sorted!";
        String actualErrorMessage = exception.getMessage();

        assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

    @Test
    void shouldReturnListImmediately_whenGivenListHasOnlyOneObject() throws EmptyListException {
        final List<Integer> listWithOneElement = new ArrayList<>();
        listWithOneElement.add(1);
        Organizer organizer = new Organizer();

        assertEquals(listWithOneElement, organizer.sort(listWithOneElement));
    }

    @Test
    void shouldReturnSortedList_whenListHasMoreThanOneElement() throws EmptyListException {
        final List<Integer> listWithMoreThanOneElement = new ArrayList<>();
        listWithMoreThanOneElement.add(2);
        listWithMoreThanOneElement.add(1);

        Organizer organizer = new Organizer();

        final List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);

        final List<Integer> sortedList = organizer.sort(listWithMoreThanOneElement);

        assertEquals(expectedList, sortedList);
    }


}
