package problems.p0100_0200.p0102_binary_tree_level_order_traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import letcode.TreeNode;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> currLevel = new ArrayList<>();
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                root = queue.poll();
                currLevel.add(root.val);
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }

            }
            ans.add(currLevel);
        }
        return ans;
    }
}
