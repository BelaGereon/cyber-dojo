package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tasks.sortingalgorithms.concretesorters.AscendingSorter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BasicSorterTest {

    private final Organizer organizer = new Organizer();
    private final Sorter anySorter = new AscendingSorter();
    private final List<Integer> list = new ArrayList<>();

    @BeforeEach
    void setup() {
        organizer.setSorter(anySorter);
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
}
