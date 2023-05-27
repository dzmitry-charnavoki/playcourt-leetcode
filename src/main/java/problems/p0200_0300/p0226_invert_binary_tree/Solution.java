package problems.p0200_0300.p0226_invert_binary_tree;

import letcode.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
