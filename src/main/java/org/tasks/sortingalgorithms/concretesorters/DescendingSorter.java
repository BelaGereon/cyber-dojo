package org.tasks.sortingalgorithms.concretesorters;

import org.tasks.sortingalgorithms.BasicSorter;

import java.util.Comparator;
import java.util.List;

public class DescendingSorter extends BasicSorter {
    @Override
    public List<Integer> sortingAlgorithm(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
