package problems.p0000_0100.p0095_unique_binary_search_trees_ii;

import java.util.ArrayList;
import java.util.List;
import letcode.TreeNode;

class Solution {
    List[][] memo;

    public List<TreeNode> generateTrees(int n) {
        memo = new List[n + 1][n + 1];
        return helper(1, n);
    }

    public List<TreeNode> helper(int m, int n) {
        List<TreeNode> result = new ArrayList<>();
        if (m > n) {
            result.add(null);
            return result;
        }
        if (memo[m][n] != null) {
            return memo[m][n];
        }
        for (int i = m; i <= n; i++) {
            List<TreeNode> ls = helper(m, i - 1);
            List<TreeNode> rs = helper(i + 1, n);
            for (TreeNode l : ls) {
                for (TreeNode r : rs) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    result.add(curr);
                }
            }
        }
        memo[m][n] = result;
        return result;
    }

}
