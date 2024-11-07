package org.example.task3;

import java.util.Comparator;
import java.util.List;

public class MyCollections {

    public static <E extends Comparable<? super E>> void sort(List<E> list) {
        list.sort(null);
    }

    public static <E extends Comparable<? super E>> void sort(List<E> list, Comparator<? super E> comparator) {
        list.sort(comparator);
    }
}
