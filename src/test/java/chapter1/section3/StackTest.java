package chapter1.section3;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class StackTest {
    int test1_StackSize = 1024;
    String[] expressions = {"( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )",
            "( ( 1 + sqrt ( 5.0 ) ) / 2.0 )"};
    double[] expressionsResults = {101.0, 1.618033988749895};

    @Test
    public void test1() {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        for (int i = 0; i < test1_StackSize; i++) {
            stack1.push(i);
            stack2.push(i);
        }
        Iterator<Integer> it = stack2.iterator();
        for (int i = test1_StackSize - 1; i >= 0; i--) {
            assertEquals(i, stack1.pop().intValue());
            assertEquals(i, it.next().intValue());
        }
    }

    @Test
    public void test2() {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        for (int j = 0; j < expressions.length; j++) {
            String[] tokens = expressions[j].split(" ");
            for (String s : tokens) {
                if (s.equals("(")) ;
                else if (s.equals("+")) ops.push(s);
                else if (s.equals("-")) ops.push(s);
                else if (s.equals("*")) ops.push(s);
                else if (s.equals("/")) ops.push(s);
                else if (s.equals("sqrt")) ops.push(s);
                else if (s.equals(")")) {
                    String op = ops.pop();
                    double v = vals.pop();
                    if (op.equals("+")) v = vals.pop() + v;
                    else if (op.equals("-")) v = vals.pop() - v;
                    else if (op.equals("*")) v = vals.pop() * v;
                    else if (op.equals("/")) v = vals.pop() / v;
                    else if (op.equals("sqrt")) v = Math.sqrt(v);
                    vals.push(v);
                } else vals.push(Double.parseDouble(s));
            }
            assertEquals(expressionsResults[j], vals.pop(), 0.0001);
        }
    }
}
