package org.tasks.sortingalgorithms.concretesorters;

import org.tasks.sortingalgorithms.EmptyListException;
import org.tasks.sortingalgorithms.Sorter;

import java.util.List;

public abstract class BasicSorter implements Sorter {
    @Override
    public List<Integer> sort(List<Integer> list) throws EmptyListException {
        List<Integer> sortedList;
        if (preconditionsAreMet(list)) {
            sortedList = sortingAlgorithm(list);
            return sortedList;
        }
        return list;
    }

    abstract List<Integer> sortingAlgorithm(List<Integer> list);

    private Boolean preconditionsAreMet(List<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("The list is empty and can not be sorted!");
        }
        return list.size() != 1;
    }
}
