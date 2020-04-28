package chapter1.section1.exercise;


import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    double[] v1 = {1, 2, 3, 4};
    double[] v2 = {1, 2};
    double v1dotv1 = 30;
    double[] v1mult10 = {10, 20, 30, 40};
    double[][] m1 = {{1, 5}, {2, 6}, {3, 7}, {4, 8}};
    double[][] m1_t = {{1, 2, 3, 4}, {5, 6, 7, 8}};
    double[] m1v1 = {30, 70};
    double[] v2m1 = {11, 14, 17, 20};
    double[][] m1m1_t = {{30, 70}, {70, 174}};

    double precision = 0.0001;

    @Test
    public void normTest() {
        assertEquals(Math.sqrt(30), Matrix.norm(v1), precision);
    }

    @Test
    public void dotTest() {
        assertEquals(v1dotv1, Matrix.dot(v1, v1), precision);
    }

    @Test
    public void mult1Test() {
        assertArrayEquals(v1mult10, Matrix.mult(10, v1), precision);
    }

    @Test
    public void tranposeTest() {
        assertTrue(Matrix.equals(m1_t, Matrix.transpose(m1)));
    }

    @Test
    public void mult2Test() {
        assertArrayEquals(m1v1, Matrix.mult(m1, v1), precision);
    }

    @Test
    public void mult3Test() {
        assertArrayEquals(v2m1, Matrix.mult(v2, m1), precision);
    }

    @Test
    public void mult4Test() {
        double[][] r = Matrix.mult(m1, m1_t);
        for (int i = 0; i < m1m1_t.length; i++) {
            assertArrayEquals(m1m1_t[i], r[i], precision);
        }
    }
}
