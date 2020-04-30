package chapter1.section4;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;

public class ThreeSumTest {
    @Test
    public void test() {
        //System.out.println(new File("..\\algs4-data").getAbsolutePath());
        int[] a1 = new In("..\\algs4-data\\4Kints.txt").readAllInts();
        Stopwatch stopwatch = new Stopwatch();
        System.out.println(ThreeSum.count(Arrays.copyOf(a1, a1.length)));
        System.out.println(stopwatch.elapsedTime());
        stopwatch = new Stopwatch();
        System.out.println(ThreeSum.count_fast(Arrays.copyOf(a1, a1.length)));
        System.out.println(stopwatch.elapsedTime());
    }
}
