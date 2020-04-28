package chapter1.section3;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class QueueTest {
    int test1_QueueSize = 1000;

    /*
     * test if output is reversed
     */
    @Test
    public void test1() {
        Queue<Integer> q1 = new Queue<Integer>();
        Queue<Integer> q2 = new Queue<Integer>();
        for (int i = 0; i < test1_QueueSize; i++) {
            q1.enqueue(i);
            q2.enqueue(i);
        }
        Iterator<Integer> it = q2.iterator();
        for (int i = 0; i < test1_QueueSize; i++) {
            assertEquals(i, q1.dequeue().intValue());
            assertEquals(i, it.next().intValue());
        }
    }
}
