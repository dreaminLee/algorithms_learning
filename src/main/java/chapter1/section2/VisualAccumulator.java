package chapter1.section2;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class VisualAccumulator extends Accumulator {

    private static final double penradius = 0.005;
    private static final Color valcolor = StdDraw.DARK_GRAY;
    private static final Color meancolor = StdDraw.RED;

    public VisualAccumulator(int trials, double max) {
        super();
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(penradius);
    }

    @Override
    public void addDataValue(double val) {
        super.addDataValue(val);
        StdDraw.setPenColor(valcolor);
        StdDraw.point(count, val);
        StdDraw.setPenColor(meancolor);
        StdDraw.point(count, total / count);
    }
}
