package Offer18;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = null;
        ListNode orginHead = head;
        while (head != null) {
            pre = head;
            head = head.next;
            if (head.val == val) {
                pre.next = head.next;
                return orginHead;
            }
        }
        return orginHead;
    }
}
