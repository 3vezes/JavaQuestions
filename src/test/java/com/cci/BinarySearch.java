package com.cci;


import java.util.List;

public final class BinarySearch {

    public static <T extends Comparable<T>> T search(List<T> items, T target) {
        return items.get(recursiveSearch(items, target, 0, items.size()));
    }

    private static <T extends Comparable<T>> int recursiveSearch(List<T> list, T target, int start, int end) {
        int range = end - start;

        int currentIndex = (range / 2) + start;

        if (currentIndex >= list.size() || end < 0) {
            throw new IllegalArgumentException("Element cannot be found.");
        }

        T currentElement = list.get(currentIndex);

        if (currentElement.compareTo(target) == 0) {
            //Found what we're looking for.
            return currentIndex;
        } else if (currentElement.compareTo(target) < 0) {
            //Search the top
            return recursiveSearch(list, target, currentIndex + 1, end);
        }

        //Search the bottom.
        return recursiveSearch(list, target, start, currentIndex - 1);
    }
}
