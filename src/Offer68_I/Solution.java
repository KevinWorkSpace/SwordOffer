package Offer68_I;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> nodes1 = new ArrayList<>();
        List<TreeNode> nodes2 = new ArrayList<>();
        find(nodes1, root, p.val);
        find(nodes2, root, q.val);
        TreeNode res = null;
        for (int i=0; i<nodes1.size() && i<nodes2.size(); i++) {
            if (nodes1.get(i).val == nodes2.get(i).val) {
                res = nodes1.get(i);
            }
            else break;
        }
        return res;
    }

    public void find(List<TreeNode> nodes, TreeNode root, int v) {
        nodes.add(root);
        if (root.val == v) {
            return;
        }
        else if (root.val > v) {
            find(nodes, root.left, v);
        }
        else {
            find(nodes, root.right, v);
        }
    }
}
