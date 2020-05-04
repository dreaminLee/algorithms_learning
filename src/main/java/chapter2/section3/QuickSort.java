package chapter2.section3;

import chapter2.section1.InsertionSort;
import chapter2.section1.Sort;

public class QuickSort extends Sort {
    private static int tinyArraySize = 10;
    private static SortTinyArrayMethod sortTinyArrayMethod = InsertionSort::sort2;

    public static void sort(Comparable<?>[] a) {
        //StdRandom.shuffle(a);
        sort_recursive(a, 0, a.length - 1);
        //assert isSorted(a);
    }

    public static void sort2(Comparable<?>[] a) {
        //StdRandom.shuffle(a);
        sort2_recursive(a, 0, a.length - 1);
        assert isSorted(a);
    }

    private static void sort_recursive(Comparable<?>[] a, int lo, int hi) {
        if (hi <= lo) return;
        int pivot = partition(a, lo, hi);
        sort_recursive(a, lo, pivot - 1);
        sort_recursive(a, pivot + 1, hi);
    }

    private static void sort2_recursive(Comparable<?>[] a, int lo, int hi) {
        if (hi <= lo + tinyArraySize) {
            sortTinyArrayMethod.sort(a, lo, hi);
            return;
        }
        int pivot = partition(a, lo, hi);
        sort2_recursive(a, lo, pivot - 1);
        sort2_recursive(a, pivot + 1, hi);
    }

    private static int partition(Comparable<?>[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable<?> pivot = a[lo];
        while (true) {
            while (less(a[++i], pivot)) if (i == hi) break;
            while (less(pivot, a[--j]));
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
