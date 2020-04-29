package chapter1.section3.exercise;

import chapter1.section3.Stack;

// exercise 1.3.4 Parentheses

public class Parentheses {
    public static boolean isValid(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char c : parentheses.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')') {
                if (stack.pop() != '(')
                    return false;
            } else if (c == ']') {
                if (stack.pop() != '[')
                    return false;
            } else if (c == '}') {
                if (stack.pop() != '{')
                    return false;
            } else
                throw new IllegalArgumentException();
        }
        return true;
    }
}
