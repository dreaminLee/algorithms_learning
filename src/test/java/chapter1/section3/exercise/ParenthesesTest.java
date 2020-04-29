package chapter1.section3.exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesesTest {

    @Test
    public void test() {
        String p1 = "[()]{}{[()()]()}";
        String p2 = "[(])";
        assertTrue(Parentheses.isValid(p1));
        assertFalse(Parentheses.isValid(p2));
    }
}
