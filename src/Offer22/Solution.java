package Offer22;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int cnt = 0;
        ListNode n1 = head;
        ListNode n2 = head;
        while (cnt < k) {
            n2 = n2.next;
            cnt ++;
        }
        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }
}