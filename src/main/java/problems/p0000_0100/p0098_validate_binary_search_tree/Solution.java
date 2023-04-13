package problems.p0000_0100.p0098_validate_binary_search_tree;

import letcode.TreeNode;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    // instead of Integer.MAX_VALUE use TreeNode for boards
    public boolean isValidBST(TreeNode root, TreeNode left, TreeNode right) {
        if (root == null) {
            return true;
        }
        if (left != null && root.val <= left.val
            || right != null && root.val >= right.val) {
            return false;
        }
        return isValidBST(root.left, left, root) && isValidBST(root.right, root, right);
    }
}
