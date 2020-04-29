package chapter1.section3.exercise;

import chapter1.section3.Stack;

// exercise 1.3.3

public class PopSequence {
    /**
     * check if a pop sequence is valid
     *
     * @param seq a sequence contains N+1 integers from 0 to N
     * @return return true if sequence is valid, else return false
     */
    public static boolean isValid(int[] seq) {
        Stack<Integer> stack = new Stack<>();
        int push = 0;
        for (int pop : seq) {
            if (pop > push) {
                while (push <= pop) stack.push(push++);
                stack.pop();
            }
            else if (pop == push) push++;
            else { // pop < push
                if (stack.pop() != pop) return false;
            }
        }
        return true;
    }
}
