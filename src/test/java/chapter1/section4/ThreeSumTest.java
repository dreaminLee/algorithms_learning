package chapter1.section4;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.io.File;

public class ThreeSumTest {
    @Test
    public void test() {
        //System.out.println(new File("..\\algs4-data").getAbsolutePath());
        int[] a1 = new In("..\\algs4-data\\1kints.txt").readAllInts();
        System.out.println(ThreeSum.count(a1));
    }
}
