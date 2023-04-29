package problems.p0100_0200.p0107_binary_tree_level_order_traversal_ii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import letcode.TreeNode;

class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }
        helper(root, 0, levels);
        Collections.reverse(levels);
        return levels;
    }

    public void helper(TreeNode node, int level, List<List<Integer>> levels) {
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);
        if (node.left != null) {
            helper(node.left, level + 1, levels);
        }
        if (node.right != null) {
            helper(node.right, level + 1, levels);
        }
    }

}
