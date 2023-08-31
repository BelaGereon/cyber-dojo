package org.tasks.sortingalgorithms.concretesorters;

import java.util.Comparator;
import java.util.List;

public class DescendingSorter extends BasicSorter {
    @Override
    List<Integer> sortingAlgorithm(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
