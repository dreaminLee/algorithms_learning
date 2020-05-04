package chapter2.section2;

import chapter2.section1.Sort;

public abstract class Merge extends Sort {
    public static void merge(Comparable<?>[] a, int lo, int mid, int hi, Comparable<?>[] aux) {
        int i = lo, j = mid + 1;
        System.arraycopy(a, lo, aux, lo, hi - lo + 1);
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
}
