package util;

import edu.princeton.cs.algs4.StdRandom;

import java.util.HashSet;
import java.util.Set;

public class ArrayOperations {

    private ArrayOperations() {
    }

    /**
     * check an array if it has duplicate elements
     *
     * @param a array to be checked
     * @return if the array has duplicate elements return true, else return false
     */
    public static boolean haveDuplicateElements(Object[] a) {
        Set<Object> set = new HashSet<>();
        for (Object o : a) {
            if (!set.add(o))
                return true;
        }
        return false;
    }

    /**
     * check an Comparable array if all elements have the same class type
     * @param a array
     * @return return true if all elements have the same class type
     */
    public static boolean isSameClass(Comparable<?>[] a) {
        Class<?> cls = a[0].getClass();
        for (Comparable<?> i : a) {
            if (cls != i.getClass()) return false;
        }
        return true;
    }

    /**
     * return a random double array
     * @param len length of the array
     * @return the array
     */
    public static Double[] randomDoubleArray(int len) {
        Double[] a = new Double[len];
        for (int i = 0; i < len; i++)
            a[i] = StdRandom.uniform();
        return a;
    }
}
