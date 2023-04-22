package problems.p0100_0200.p0105_construct_binary_tree_from_preorder_and_inorder_traversal;

import java.util.HashMap;
import java.util.Map;
import letcode.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inToIndex = new HashMap<>();

        for (int i = 0; i < inorder.length; ++i) {
            inToIndex.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length - 1, 0, inToIndex);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int inStart,
                           Map<Integer, Integer> inToIndex) {
        if (preStart > preEnd) {
            return null;
        }

        final int rootVal = preorder[preStart];
        final int rootInIndex = inToIndex.get(rootVal);
        final int leftSize = rootInIndex - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder, preStart + 1, preStart + leftSize, inStart, inToIndex);
        root.right = build(preorder, preStart + leftSize + 1, preEnd, rootInIndex + 1, inToIndex);

        return root;
    }

}
