package chapter2.section1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static chapter2.section1.Sort.sortTime;
import static org.junit.Assert.assertTrue;
import static util.ArrayOperations.randomDoubleArray;


public class SortTest {
    Double[][] arrays;
    int N = 1000;
    int len = 2000;

    @Before
    public void initArray() {
        arrays = new Double[N][];
        for (int i = 0; i < N; i++) {
            arrays[i] = randomDoubleArray(len);
        }
    }

    public double sortArraysTime(SortAlgorithm sortAlgorithm) {
        double totalTime = 0.0;
        for (Double[] i : arrays) {
            totalTime += sortTime(sortAlgorithm, Arrays.copyOf(i, i.length));
        }
        return totalTime / N;
    }

    @Test
    public void SelectionSortTest() {
        System.out.println(sortArraysTime(SelectionSort::sort));
    }

    @Test
    public void InsertionSortTest() {
        System.out.println(sortArraysTime(InsertionSort::sort));
    }
}
