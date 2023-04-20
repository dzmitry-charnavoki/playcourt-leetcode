package problems.p0600_0700.p0662_maximum_width_of_binary_tree;

import java.util.HashMap;
import java.util.Map;
import letcode.TreeNode;

class Solution {

    private int maxWidth;
    private Map<Integer, Integer> lp = new HashMap<>();

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        return maxWidth;
    }

    private void dfs(TreeNode root, int depth, int pos) {
        if (root == null) {
            return;
        }
        //  to store the leftmost position (pos) for each depth level (depth)
        lp.computeIfAbsent(depth, x -> pos);
        // pos represents the position of the current node.
        // lp.get(depth) returns the position of the leftmost node at the current depth.
        // pos - lp.get(depth) calculates the difference between nodes
        // Adding 1 to the result accounts for the width, including the leftmost node itself.
        int widthBtwCurAndLeftmostNode = pos - lp.get(depth) + 1;
        maxWidth = Math.max(maxWidth, widthBtwCurAndLeftmostNode);
        dfs(root.left, depth + 1, pos * 2);
        dfs(root.right, depth + 1, pos * 2 + 1);
    }

}
