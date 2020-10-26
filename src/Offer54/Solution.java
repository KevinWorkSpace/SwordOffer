package Offer54;

import java.util.PriorityQueue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    private PriorityQueue<Integer> pq;
    private int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        pq = new PriorityQueue<>();
        tranverse(root);
        return pq.peek();
    }

    public void tranverse(TreeNode root) {
        if (root == null) return;
        if (pq.size() < k) {
            pq.add(root.val);
        }
        else if (root.val > pq.peek()) {
            pq.poll();
            pq.add(root.val);
        }
        tranverse(root.left);
        tranverse(root.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        Solution solution = new Solution();
        int res = solution.kthLargest(t1, 1);
        System.out.println(res);
    }
}