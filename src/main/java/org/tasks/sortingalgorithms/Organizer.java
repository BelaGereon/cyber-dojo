package org.tasks.sortingalgorithms;

import java.util.List;

public class Organizer {
    public List<Integer> sort(List<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("The list is empty and can not be sorted!");
        }
         return list;
    }
}
