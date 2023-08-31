package org.tasks.sortingalgorithms.concretesorters;

import org.tasks.sortingalgorithms.BasicSorter;

import java.util.List;

public class AscendingSorter extends BasicSorter {
    @Override
    public List<Integer> sortingAlgorithm(List<Integer> list) {
        return list.stream().sorted().toList();
    }
}
