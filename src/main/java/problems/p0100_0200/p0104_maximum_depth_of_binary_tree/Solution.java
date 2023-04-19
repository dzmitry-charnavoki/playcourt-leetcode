package problems.p0100_0200.p0104_maximum_depth_of_binary_tree;

import letcode.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
