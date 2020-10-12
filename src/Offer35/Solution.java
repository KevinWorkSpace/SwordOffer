package Offer35;

import java.util.HashMap;
import java.util.HashSet;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {

    private HashMap<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (map.containsKey(head)) {
            return map.get(head);
        }
        Node newHead = new Node(head.val);
        map.put(head, newHead);
        newHead.next = copyRandomList(head.next);
        newHead.random = copyRandomList(head.random);
        return newHead;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        n1.random = n2;
        n2.random = n1;
        Solution solution = new Solution();
        solution.copyRandomList(n1);
    }
}