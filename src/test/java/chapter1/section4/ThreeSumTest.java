package chapter1.section4;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.util.Arrays;

public class ThreeSumTest {
    //System.out.println(new File("..\\algs4-data").getAbsolutePath());
    int[] a1 = new In("..\\algs4-data\\4Kints.txt").readAllInts();

    @Test
    public void test() {
        StopwatchCPU stopwatch = new StopwatchCPU();
        System.out.println(ThreeSum.count(Arrays.copyOf(a1, a1.length), 0));
        System.out.println(stopwatch.elapsedTime());
    }

    @Test
    public void test_fast() {
        StopwatchCPU stopwatch = new StopwatchCPU();
        System.out.println(ThreeSum.count_fast(Arrays.copyOf(a1, a1.length), 0));
        System.out.println(stopwatch.elapsedTime());
    }

    @Test
    public void test_faster() {
        StopwatchCPU stopwatch = new StopwatchCPU();
        System.out.println(ThreeSum.count_faster(Arrays.copyOf(a1, a1.length), 0));
        System.out.println(stopwatch.elapsedTime());
    }
}
