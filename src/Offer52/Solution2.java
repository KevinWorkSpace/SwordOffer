package Offer52;

import java.util.HashSet;

public class Solution2 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode s1 = headA;
        ListNode s2 = headB;
        while (headA != headB) {
            if (headA != null) {
                headA = headA.next;
            }
            else headA = s2;
            if (headB != null) {
                headB = headB.next;
            }
            else headB = s1;
        }
        return headA;
    }
}
