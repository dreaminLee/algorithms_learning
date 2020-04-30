package chapter1.section4;

import edu.princeton.cs.algs4.In;
import org.junit.Test;
import util.ArrayOperations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSumTest {
    int[] a1 = new In("..\\algs4-data\\1Mints.txt").readAllInts();

    @Test
    public void test() {
        StopwatchCPU stopwatch = new StopwatchCPU();
        System.out.println(TwoSum.count(Arrays.copyOf(a1, a1.length), 0));
        System.out.println(stopwatch.elapsedTime());
    }

    @Test
    public void test_fast() {
        StopwatchCPU stopwatch = new StopwatchCPU();
        System.out.println(TwoSum.count_fast(Arrays.copyOf(a1, a1.length), 0));
        System.out.println(stopwatch.elapsedTime());
    }

    @Test
    public void test_faster() {
        StopwatchCPU stopwatch = new StopwatchCPU();
        System.out.println(TwoSum.count_faster(Arrays.copyOf(a1, a1.length), 0));
        System.out.println(stopwatch.elapsedTime());
    }
}
