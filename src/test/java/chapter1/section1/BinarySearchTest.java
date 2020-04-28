package chapter1.section1;

import edu.princeton.cs.algs4.In;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    int[] datalist = new In("D:\\Codes\\java_workspace\\Algorithm\\algs4-data\\largeW.txt").readAllInts();
    int[] findlist = new In("D:\\Codes\\java_workspace\\Algorithm\\algs4-data\\largeT.txt").readAllInts();

    @Before
    public void sortDatalist() {
        Arrays.sort(datalist);
    }

    @Test
    public void testRank() {
        for (int i = 0; i < datalist.length; i++) {
            int expected = Arrays.binarySearch(datalist, findlist[i]);
            if (expected < 0) expected = -1;
            int result = BinarySearch.rank(findlist[i], datalist);
            assertEquals(expected, result);
        }
    }
}
