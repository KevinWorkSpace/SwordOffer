package Offer36;

public class TreeToDoublyList {

    Node pre = null;
    Node head = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        head = getHead(root);
        pre = head;
        inorder(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public Node getHead(Node root) {
        if (root.left == null) {
            return root;
        }
        else return getHead(root.left);
    }

    public void inorder(Node root) {
        if (root.left != null) {
            inorder(root.left);
        }
        if (root != head) {
            pre.right = root;
            root.left = pre;
            pre = pre.right;
        }
        if (root.right != null) {
            inorder(root.right);
        }
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
