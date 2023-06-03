package problems.p0100_0200.p0124_binary_tree_maximum_path_sum;

import letcode.TreeNode;

class Solution {
    private int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumDownFrom(root);
        return ans;
    }

    private int maxPathSumDownFrom(TreeNode node) {
        if (node == null) {
            return 0;
        }
        final int l = Math.max(maxPathSumDownFrom(node.left), 0);
        final int r = Math.max(maxPathSumDownFrom(node.right), 0);
        ans = Math.max(ans, node.val + l + r);

        return node.val + Math.max(l, r);
    }
}
