package org.tasks.sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

public class TestHelper {
    static List<Integer> fillListWithArrayElements(int[] array) {
        List<Integer> filledList = new ArrayList<>();
        for (int element : array) {
            filledList.add(element);
        }
        return filledList;
    }
}
