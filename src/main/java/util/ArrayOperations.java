package util;

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
}
