package Offer68_I;

public class Solution2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            }
            else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            }
            else break;
        }
        return root;
    }
}
