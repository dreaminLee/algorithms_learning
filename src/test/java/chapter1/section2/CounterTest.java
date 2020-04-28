package chapter1.section2;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;


public class CounterTest {

    Random random;

    @Before
    public void setRandom() {
        random = new Random(System.currentTimeMillis());
    }

    @Test
    public void Flips() {
        int T = random.nextInt(0x7fffffff);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tails.increment();
        }
        System.out.printf("heads %d, tails %d, delta %d\n",
                heads.tally(), tails.tally(), Math.abs(heads.tally() - tails.tally()));
        if (heads.tally() == tails.tally())
            System.out.println("Tie");
        else
            System.out.println(Counter.max(heads, tails) + " wins");
    }
}
