package problems.p0100_0200.p0199_binary_tree_right_side_view;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import letcode.TreeNode;

class Solution {

    //Level order traversal
    // bfs
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new ArrayDeque<>(Arrays.asList(root));
        while (!queue.isEmpty()) {
            final int s = queue.size();
            TreeNode cur = null;
            for (int i = 0; i < s; i++) {
                cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            ans.add(cur.val);
        }
        return ans;
    }

    public List<Integer> rightSideViewDFS(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res, int depth) {
        if (root == null) {
            return;
        }
        if (res.size() == depth) {
            res.add(root.val);
        }
        helper(root.right, res, depth + 1);
        helper(root.left, res, depth + 1);
    }
}
