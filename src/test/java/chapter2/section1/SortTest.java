package chapter2.section1;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static chapter2.section1.Sort.sortTime;
import static org.junit.Assert.assertTrue;


public class SortTest {
    Double[] a;
    int len = 50000;

    @Before
    public void initArray() {
        a = new Double[len];
        for (int i = 0; i < len; i++) {
            a[i] = StdRandom.uniform();
        }
        Arrays.sort(a);
    }

    @Test
    public void SelectionSortTest() {
        Double[] t = Arrays.copyOf(a, len);
        System.out.println(sortTime(SelectionSort::sort, t));
        assertTrue(Sort.isSorted(t));
    }

    @Test
    public void InsertionSortTest() {
        Double[] t = Arrays.copyOf(a, len);
        System.out.println(InsertionSort.countInversion(t));
        System.out.println(sortTime(InsertionSort::sort, t));
        assertTrue(Sort.isSorted(t));
    }
}
