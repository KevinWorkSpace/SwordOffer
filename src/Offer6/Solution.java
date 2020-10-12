package Offer6;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            size ++;
        }
        int[] res = new int[size];
        for (int i=0; i<size; i++) {
            res[i] = prev.val;
            prev = prev.next;
        }
        return res;
    }
}
