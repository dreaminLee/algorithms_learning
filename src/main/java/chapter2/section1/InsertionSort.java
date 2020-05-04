package chapter2.section1;

public class InsertionSort extends Sort {
    public static void sort(Comparable<?>[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable<?>[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void sort2(Comparable<?>[] a) {
        sort2(a, 0, a.length - 1);
    }

    public static void sort2(Comparable<?>[] a, int lo, int hi) {
        Comparable<?> x;
        for (int i = lo + 1; i <= hi; i++) {
            x = a[i];
            int j = i - 1;
            while (j >= lo && less(x, a[j])) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }

    // insertion sort is most efficient when the number of inversions is low
    public static int countInversion(Comparable<?>[] a) {
        int len = a.length, cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (less(a[j], a[i])) cnt++;
            }
        }
        return cnt;
    }
}
