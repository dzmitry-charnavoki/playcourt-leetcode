package problems.p0100_0200.p0101_symmetric_tree;

import letcode.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (r == null || l == null) {
            return r == l;
        }
        return r.val == l.val
            && isSymmetric(l.left, r.right)
            && isSymmetric(l.right, r.left);
    }

}
