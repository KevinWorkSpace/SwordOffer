package Offer54;

import java.util.PriorityQueue;

class Solution2 {

    private int cnt = 0;
    private int k;
    private int res;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        transverse(root);
        return res;
    }

    public void transverse(TreeNode root) {
        if (root == null) return;
        transverse(root.right);
        cnt ++;
        if (cnt == k) {
            res = root.val;
            return;
        }
        else if (cnt > k) {
            return;
        }
        transverse(root.left);
    }
}
