package chapter2.section2;

import chapter2.section1.InsertionSort;
import chapter2.section3.SortTinyArrayMethod;

public class MergeSort extends Merge {
    private static Comparable<?>[] aux;
    private static int tinyArraySize = 10;
    private static SortTinyArrayMethod sortTinyArrayMethod = InsertionSort::sort2;

    public static void sort(Comparable<?>[] a) {
        aux = new Comparable<?>[a.length];
        sort_recursive(a, 0, a.length - 1);
        //assert isSorted(a);
    }

    public static void sort2(Comparable<?>[] a) {
        aux = new Comparable<?>[a.length];
        sort2_recursive(a, 0, a.length - 1);
        //assert isSorted(a);
    }

    private static void sort_recursive(Comparable<?>[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort_recursive(a, lo, mid);
        sort_recursive(a, mid + 1, hi);
        if (noGreaterThan(a[mid], a[mid + 1])) return; // exercise 2.2.8
        merge(a, lo, mid, hi, aux);
    }

    private static void sort2_recursive(Comparable<?>[] a, int lo, int hi) {
        if (hi <= lo + tinyArraySize) {
            sortTinyArrayMethod.sort(a, lo, hi);
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort2_recursive(a, lo, mid);
        sort2_recursive(a, mid + 1, hi);
        if (noGreaterThan(a[mid], a[mid + 1])) return; // exercise 2.2.8
        merge(a, lo, mid, hi, aux);
    }
}
