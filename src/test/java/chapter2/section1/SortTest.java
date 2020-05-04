package chapter2.section1;

import chapter2.section2.MergeBUSort;
import chapter2.section2.MergeSort;
import chapter2.section3.QuickSort;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static chapter2.section1.Sort.sortTime;
import static util.ArrayOperations.randomDoubleArray;


public class SortTest {
    Double[][] arrays;
    int N = 200;
    int len = 100000;

    @Before
    public void initArrays() {
        arrays = new Double[N][];
        for (int i = 0; i < N; i++) {
            arrays[i] = randomDoubleArray(len);
        }
    }

    public Double[] concat2SortedArrays(int size1, int size2) {
        Double[] t1 = randomDoubleArray(size1);
        Double[] t2 = randomDoubleArray(size2);
        Arrays.sort(t1);
        Arrays.sort(t2);
        return ArrayUtils.addAll(t1, t2);
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
        //System.out.printf("Selection sort:  %.6f\n", sortArraysTime(SelectionSort::sort));
        //System.out.printf("Insertion sort:  %.6f\n", sortArraysTime(InsertionSort::sort));
        //System.out.printf("Insertion sort2: %.6f\n", sortArraysTime(InsertionSort::sort2));
        //System.out.printf("Shell sort:      %.6f\n", sortArraysTime(ShellSort::sort));
        //System.out.printf("Shell sort2:     %.6f\n", sortArraysTime(ShellSort::sort2));
        System.out.printf("Merge sort:      %.6f\n", sortArraysTime(MergeSort::sort));
        System.out.printf("Merge sort2:     %.6f\n", sortArraysTime(MergeSort::sort2));
        System.out.printf("MergeBU sort:    %.6f\n", sortArraysTime(MergeBUSort::sort));
        System.out.printf("Quick sort:      %.6f\n", sortArraysTime(QuickSort::sort));
        System.out.printf("Quick sort2:     %.6f\n", sortArraysTime(QuickSort::sort2));
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
