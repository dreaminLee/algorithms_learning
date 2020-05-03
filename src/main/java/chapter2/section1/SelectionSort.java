package chapter2.section1;

public class SelectionSort extends Sort {
    public static void sort(Comparable<?>[] a) {
        int len = a.length;
        int smallest_index;
        for (int i = 0; i < len; i++) {
            smallest_index = i;
            for (int j = i + 1; j < len; j++)
                if (less(a[j], a[smallest_index]))
                    smallest_index = j;
            exch(a, i, smallest_index);
        }
    }
}
