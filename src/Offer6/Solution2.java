package Offer6;

import java.util.Stack;

public class Solution2 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i=0; i<res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
