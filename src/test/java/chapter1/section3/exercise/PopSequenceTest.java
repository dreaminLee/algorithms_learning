package chapter1.section3.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PopSequenceTest {
    int[][] testcases = {{4, 3, 2, 1, 0, 9, 8, 7, 6, 5},
            {4, 6, 8, 7, 5, 3, 2, 9, 0, 1},
            {2, 5, 6, 7, 4, 8, 9, 3, 1, 0},
            {4, 3, 2, 1, 0, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 9, 8, 7, 0},
            {0, 4, 6, 5, 3, 8, 1, 7, 2, 9},
            {1, 4, 7, 9, 8, 6, 5, 3, 0, 2},
            {2, 1, 4, 3, 6, 5, 8, 7, 9, 0}};
    boolean[] results = {true, false, true, true, true, false, false, true};

    @Test
    public void test() {
        for (int i = 0; i < testcases.length; i++) {
            assertEquals(results[i], PopSequence.isValid(testcases[i]));
        }
    }
}
