package org.tyaa.demo.java.se.interfaces;

public class BubbleSort {

    public static void sort(Integer[] items) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < items.length - 1; i++) {
                final Integer current = items[i];
                final Integer next = items[i + 1];
                if (current - next > 0) {
                    items[i] = next;
                    items[i + 1] = current;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }

    public static void uniSort(Object[] items, IComparator comparator) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < items.length - 1; i++) {
                final Object current = items[i];
                final Object next = items[i + 1];
                if (comparator.compare(current, next) > 0) {
                    items[i] = next;
                    items[i + 1] = current;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }

    public static <T> void uniSortGeneric (T[] items, IComparatorGeneric<T> comparator) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < items.length - 1; i++) {
                final T current = items[i];
                final T next = items[i + 1];
                if (comparator.compare(current, next) > 0) {
                    items[i] = next;
                    items[i + 1] = current;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }

    public static <T extends Number> void numberSort(T[] items) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < items.length - 1; i++) {
                final T current = items[i];
                final T next = items[i + 1];
                if (current.doubleValue() - next.doubleValue() > 0) {
                    items[i] = next;
                    items[i + 1] = current;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }
}