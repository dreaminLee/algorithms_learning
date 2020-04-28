package chapter1;

public class Accumulator {
    double total;
    int count;

    public Accumulator() {
        total = 0.0;
        count = 0;
    }

    public void addDataValue(double val) {
        count++;
        total += val;
    }

    public void reset() {
        total = 0.0;
        count = 0;
    }

    public double mean() {
        return total / count;
    }

    @Override
    public String toString() {
        return "Mean (" + count + " values): " + String.format("%7.5f", mean());
    }
}
