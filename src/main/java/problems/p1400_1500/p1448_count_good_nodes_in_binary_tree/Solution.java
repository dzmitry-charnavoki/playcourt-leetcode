package problems.p1400_1500.p1448_count_good_nodes_in_binary_tree;

import letcode.TreeNode;

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int prev) {
        if (node == null) {
            return 0;
        }
        int res = node.val >= prev ? 1 : 0;
        int max = Math.max(prev, node.val);
        res += dfs(node.left, max);
        res += dfs(node.right, max);
        return res;
    }
}
