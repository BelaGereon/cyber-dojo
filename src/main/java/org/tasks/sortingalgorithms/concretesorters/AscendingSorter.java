package org.tasks.sortingalgorithms.concretesorters;

import java.util.List;

public class AscendingSorter extends BasicSorter {
    @Override
    List<Integer> sortingAlgorithm(List<Integer> list) {
        return list.stream().sorted().toList();
    }
}
