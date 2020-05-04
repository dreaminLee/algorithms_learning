package chapter2.section1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StopwatchCPU;

public abstract class Sort {
    // implement class Sort with a new static method called void sort(Comparable[] a)

    public static void show(Comparable<?>[] a) {
        for (Comparable<?> i : a) {
            StdOut.print(i + " ");
        }
        StdOut.println();
    }

    public static double sortTime(SortAlgorithm sortAlgorithm, Comparable<?>[] a) {
        StopwatchCPU stopwatchCPU = new StopwatchCPU();
        sortAlgorithm.sort(a);
        return stopwatchCPU.elapsedTime();
    }

    public static boolean isSorted(Comparable<?>[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static boolean noGreaterThan(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }

    protected static int compare(Comparable v, Comparable w) {
        return v.compareTo(w);
    }

    protected static void exch(Comparable<?>[] a, int i, int j) {
        Comparable<?> t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
