package Offer6;

import java.util.ArrayList;

public class Solution3 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        recur(head, list);
        int[] res = new int[list.size()];
        for (int i=0; i<res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void recur(ListNode head, ArrayList<Integer> list) {
        if (head == null) return;
        recur(head.next, list);
        list.add(head.val);
    }
}
