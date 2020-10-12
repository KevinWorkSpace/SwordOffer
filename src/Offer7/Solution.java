package Offer7;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    private HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i=0; i<inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
        return root;
    }

    public TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart == preEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = map.get(root.val);
        int Llen = inRoot - inStart;
        root.left = buildTreeHelper(preorder, preStart+1, preStart+1+Llen, inorder, inStart, inRoot);
        root.right = buildTreeHelper(preorder, preStart+1+Llen, preEnd, inorder, inRoot+1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Solution solution = new Solution();
        solution.buildTree(preorder, inorder);
    }
}
