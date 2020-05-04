package chapter2.section2;

public class MergeBUSort extends Merge {
    private static Comparable<?>[] aux;

    public static void sort(Comparable<?>[] a) {
        int len = a.length;
        aux = new Comparable<?>[a.length];
        for (int sz = 1; sz < len; sz *= 2) {
            for (int lo = 0; lo < len - sz; lo += 2 * sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, len - 1), aux);
            }
        }
    }
}
