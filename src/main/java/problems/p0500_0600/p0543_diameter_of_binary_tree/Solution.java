package problems.p0500_0600.p0543_diameter_of_binary_tree;

import letcode.TreeNode;

class Solution {
    int maxDepth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        //     1
        //    /\
        //   2  3
        //  /\
        // 4  5
        dfs(root);
        return maxDepth;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = dfs(node.left);
        int r = dfs(node.right);
        maxDepth = Math.max(maxDepth, l + r);
        return 1 + Math.max(l, r);
    }

}
