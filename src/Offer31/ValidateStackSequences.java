package Offer31;

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<pushed.length; i++) {
            int p = pushed[i];
            stack.add(p);
            while (!stack.isEmpty() && stack.peek() == popped[cnt]) {
                stack.pop();
                cnt ++;
            }
        }
        return cnt == popped.length;
    }
}
