package problems.p0100_0200.p0110_balanced_binary_tree;

import letcode.TreeNode;

class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1
            && isBalanced(root.left)
            && isBalanced(root.right);
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }

}
