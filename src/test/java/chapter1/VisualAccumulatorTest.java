package chapter1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class VisualAccumulatorTest {
    int numberofvals = 5000;

    Random random;

    @Before
    public void setRandom() {
        random = new Random(System.currentTimeMillis());
    }

    @Test
    public void test() {
        VisualAccumulator a = new VisualAccumulator(numberofvals, 1.0);
        for (int t = 0; t < numberofvals; t++)
            a.addDataValue(random.nextDouble());
        System.out.println(a);
        a.reset();
        assertEquals(0, a.count);
        assertEquals(0.0, a.count, 0.0001);
    }
}
