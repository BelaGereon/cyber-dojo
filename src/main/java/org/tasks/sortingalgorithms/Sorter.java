package org.tasks.sortingalgorithms;

import java.util.List;

public interface Sorter {
    List<Integer> sort(List<Integer> list) throws EmptyListException;
}
