package chapter1.section3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {
    double[] data1 = {100, 99, 101, 120, 98, 107, 109, 81, 101, 90};
    double data1Mean = 100.60;
    double data1StdDev = 10.51;

    private double round2(double d) {
        return Double.parseDouble(String.format("%.2f", d));
    }

    @Test
    public void test1() {
        Bag<Double> numbers = new Bag<Double>();
        for (double v : data1) numbers.add(v);
        int N = numbers.size();

        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean) * (x - mean);
        double std = Math.sqrt(sum / (N - 1));

        assertEquals(data1Mean, round2(mean), 0.0001);
        assertEquals(data1StdDev, round2(std), 0.0001);
    }
}
