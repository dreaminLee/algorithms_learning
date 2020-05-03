package chapter2.section1;

public class InsertionSort extends Sort {
    public static void sort(Comparable<?>[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }

    public static void sort2(Comparable<?>[] a) {
        int len = a.length;
        Comparable<?> x;
        for (int i = 1; i < len; i++) {
            x = a[i];
            int j = i - 1;
            while (j >= 0 && less(x, a[j])) {
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
