package chapter1.section4;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {
    @Test
    public void test() {
        int[] a1 = new In("..\\algs4-data\\32Kints.txt").readAllInts();
        Stopwatch stopwatch = new Stopwatch();
        System.out.println(TwoSum.count(Arrays.copyOf(a1, a1.length)));
        System.out.println(stopwatch.elapsedTime());
        stopwatch = new Stopwatch();
        System.out.println(TwoSum.count_fast(Arrays.copyOf(a1, a1.length)));
        System.out.println(stopwatch.elapsedTime());
    }
}
