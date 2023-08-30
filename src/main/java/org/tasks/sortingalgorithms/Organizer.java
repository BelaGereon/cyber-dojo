package org.tasks.sortingalgorithms;

import java.util.List;

public class Organizer {
    private Sorter currentSorter;

    public List<Integer> sort(List<Integer> list) throws EmptyListException{
        return currentSorter.sort(list);
    }

    public void setSorter(Sorter sorter) {
        this.currentSorter = sorter;
    }
}
