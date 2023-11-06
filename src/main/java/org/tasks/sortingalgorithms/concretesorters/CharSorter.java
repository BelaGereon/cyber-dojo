package org.tasks.sortingalgorithms.concretesorters;

import org.tasks.sortingalgorithms.EmptyListException;
import org.tasks.sortingalgorithms.Sorter;

import java.util.List;
import java.util.function.Function;

public class CharSorter implements Sorter {
    @Override
    public List<Integer> sort(List<Integer> list) throws EmptyListException {
        return list.stream().map(getCharsInEntries()).sorted().toList();
    }

    private static Function<Integer, Integer> getCharsInEntries() {
        return entry -> Math.toIntExact(entry.toString().chars().count());
    }
}
