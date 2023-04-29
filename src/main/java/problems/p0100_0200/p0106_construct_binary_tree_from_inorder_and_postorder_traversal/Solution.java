package problems.p0100_0200.p0106_construct_binary_tree_from_inorder_and_postorder_traversal;

import java.util.HashMap;
import java.util.Map;
import letcode.TreeNode;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderToIndex = new HashMap<>();

        for (int i = 0; i < inorder.length; ++i) {
            inorderToIndex.put(inorder[i], i);
        }

        return build(0, inorder.length - 1, postorder, 0, postorder.length - 1, inorderToIndex);
    }

    TreeNode build(int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
                   Map<Integer, Integer> inToIndex) {
        if (inStart > inEnd) {
            return null;
        }

        final int rootVal = postorder[postEnd];
        final int rootInIndex = inToIndex.get(rootVal);
        final int leftSize = rootInIndex - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(inStart, rootInIndex - 1, postorder, postStart, postStart + leftSize - 1,
            inToIndex);
        root.right =
            build(rootInIndex + 1, inEnd, postorder, postStart + leftSize, postEnd - 1, inToIndex);
        return root;
    }

}
