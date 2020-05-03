package chapter2.section1;

import edu.princeton.cs.algs4.Shell;
import org.junit.Before;
import org.junit.Test;
import util.ArrayOperations;

import java.util.Arrays;

import static chapter2.section1.Sort.sortTime;
import static org.junit.Assert.assertTrue;
import static util.ArrayOperations.randomDoubleArray;


public class SortTest {
    Double[][] arrays;
    int N = 100;
    int len = 5000;

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
    public void SortTime() {
        System.out.printf("Sort %d randomly generated arrays with %d elements, average time:\n", N, len);
        System.out.printf("Selection sort:  %.6f\n", sortArraysTime(SelectionSort::sort));
        System.out.printf("Insertion sort:  %.6f\n", sortArraysTime(InsertionSort::sort));
        System.out.printf("Insertion sort2: %.6f\n", sortArraysTime(InsertionSort::sort2));
        System.out.printf("Shell sort:      %.6f\n", sortArraysTime(ShellSort::sort));
        System.out.printf("Shell sort2:     %.6f\n", sortArraysTime(ShellSort::sort2));
    }

    @Test
    public void SelectionSortTest() {
        System.out.println(sortArraysTime(SelectionSort::sort));
    }

    @Test
    public void InsertionSortTest() {
        System.out.println(sortArraysTime(InsertionSort::sort));
    }

    @Test
    public void ShellSortTest() {
        System.out.println(sortArraysTime(ShellSort::sort));
    }
}
