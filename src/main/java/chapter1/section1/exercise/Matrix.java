package chapter1.section1.exercise;

// exercise 1.1.33

import java.util.Arrays;

public class Matrix {

    public static double norm(double[] x) {
        return Math.sqrt(Arrays.stream(x).reduce(0, (r, n) -> r + n * n));
    }

    public static boolean equals(double[][] a, double[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) return false;
        else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j] != b[i][j]) return false;
                }
            }
            return true;
        }
    }

    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) throw new IllegalArgumentException();
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    public static double[][] transpose(double[][] a) {
        double[][] t = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    /**
     * return y = kx
     *
     * @param k coefficient
     * @param x vector
     * @return vector kx
     */
    public static double[] mult(double k, double[] x) {
        return Arrays.stream(x).map(n -> k * n).toArray();
    }

    /**
     * return r = Ax
     *
     * @param a matrix
     * @param x vector
     * @return Ax
     */
    public static double[] mult(double[][] a, double[] x) {
        if (a.length != x.length) throw new IllegalArgumentException();
        double[] r = new double[a[0].length];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < x.length; j++) {
                r[i] += a[j][i] * x[j];
            }
        }
        return r;
    }

    /**
     * return r = yA
     *
     * @param y vector
     * @param a matrix
     * @return yA
     */
    public static double[] mult(double[] y, double[][] a) {
        if (a[0].length != y.length) throw new IllegalArgumentException();
        double[] r = new double[a.length];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < y.length; j++) {
                r[i] += a[i][j] * y[j];
            }
        }
        return r;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        if (a.length != b[0].length) throw new IllegalArgumentException();
        double[][] r = new double[b.length][];
        for (int i = 0; i < r.length; i++) {
            r[i] = mult(a, b[i]);
        }
        return r;
    }
}
