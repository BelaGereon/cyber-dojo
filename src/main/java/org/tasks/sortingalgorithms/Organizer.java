package org.tasks.sortingalgorithms;

import java.util.List;

public class Organizer {
    public void sort(List<Integer> emptyList) throws EmptyListException {
        if (emptyList.isEmpty()) {
            throw new EmptyListException("The list is empty and can not be sorted!");
        }
    }
}
