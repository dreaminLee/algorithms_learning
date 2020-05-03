package chapter2.section1;

public class ShellSort extends Sort {
    public static void sort(Comparable[] a) {
        int len = a.length;
        int h = 1;
        while (h < len / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            h = h / 3;
        }
    }

    public static void sort2(Comparable[] a) {
        int len = a.length;
        int h = 1;
        while (h < len / 3) h = 3 * h + 1;
        Comparable x;
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                x = a[i];
                int j = i - h;
                while (j >= 0 && less(x, a[j])) {
                    a[j + h] = a[j];
                    j -= h;
                }
                a[j + h] = x;
            }
            h = h / 3;
        }
    }
}
