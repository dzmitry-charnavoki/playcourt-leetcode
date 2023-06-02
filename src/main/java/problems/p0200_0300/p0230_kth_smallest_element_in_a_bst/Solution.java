package problems.p0200_0300.p0230_kth_smallest_element_in_a_bst;

import java.util.Stack;
import letcode.TreeNode;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int n = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            n++;
            if (n == k) {
                return cur.val;
            }
            cur = cur.right;
        }
        return -1;
    }


}
