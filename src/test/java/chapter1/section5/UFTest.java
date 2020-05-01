package chapter1.section5;

import edu.princeton.cs.algs4.In;
import org.junit.Test;
import static org.junit.Assert.*;

public class UFTest {
    @Test
    public void test1() {
        //int[] data = new In("..\\algs4-data\\tinyUF.txt").readAllInts(); // 2 components
        //int[] data = new In("..\\algs4-data\\mediumUF.txt").readAllInts(); // 3 components
        int[] data = new In("..\\algs4-data\\largeUF.txt").readAllInts(); // 6 components
        UF uf = new UFQuickUnionWeighted(data[0]);
        for (int i = 1; i < data.length; i += 2) {
            uf.union(data[i], data[i+1]);
        }
        assertEquals(6, uf.count());
    }
}
