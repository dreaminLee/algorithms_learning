package chapter2.section1;

public class SelectionSort extends Sort {
    public static void sort(Comparable<?>[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable<?>[] a, int lo, int hi) {
        int smallest_index;
        for (int i = lo; i <= hi; i++) {
            smallest_index = i;
            for (int j = i + 1; j <= hi; j++) {
                if (less(a[j], a[smallest_index])) {
                    smallest_index = j;
                }
            }
            exch(a, i, smallest_index);
        }
    }
}

