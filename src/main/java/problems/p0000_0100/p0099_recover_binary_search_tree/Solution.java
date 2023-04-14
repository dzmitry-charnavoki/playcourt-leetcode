package problems.p0000_0100.p0099_recover_binary_search_tree;

import letcode.TreeNode;

class Solution {
    private TreeNode pred = null;
    private TreeNode first = null;
    private TreeNode second = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        swap(first, second);
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (pred != null && root.val < pred.val) {
            second = root;
            if (first == null) {
                first = pred;
            } else {
                return;
            }
        }
        pred = root;

        inorder(root.right);
    }

    private void swap(TreeNode x, TreeNode y) {
        final int temp = x.val;
        x.val = y.val;
        y.val = temp;
    }
}
