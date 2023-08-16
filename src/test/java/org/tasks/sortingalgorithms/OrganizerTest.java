package org.tasks.sortingalgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OrganizerTest {

    @Test
    void shouldReturnNoElementsException_whenGivenListIsEmpty() {
        final List<Integer> emptyList = new ArrayList<>();
        Organizer organizer = new Organizer();

        Exception exception = Assertions.assertThrows(EmptyListException.class, () -> {
            organizer.sort(emptyList);
        });

        String expectedErrorMessage = "The list is empty and can not be sorted!";
        String actualErrorMessage = exception.getMessage();

        Assertions.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

}
