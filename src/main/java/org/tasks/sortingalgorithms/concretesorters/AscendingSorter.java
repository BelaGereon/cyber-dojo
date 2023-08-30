package org.tasks.sortingalgorithms.concretesorters;

import org.tasks.sortingalgorithms.EmptyListException;
import org.tasks.sortingalgorithms.Sorter;

import java.util.List;

public class AscendingSorter implements Sorter {
    @Override
    public List<Integer> sort(List<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("The list is empty and can not be sorted!");
        }

        if (list.size() == 1) {
            return list;
        }

        return list.stream().sorted().toList();
    }
}
