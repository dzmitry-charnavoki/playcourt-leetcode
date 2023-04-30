package problems.p0100_0200.p0108_convert_sorted_array_to_binary_search_tree;

import letcode.TreeNode;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = (l + r) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = helper(nums, l, m - 1);
        node.right = helper(nums, m + 1, r);
        return node;
    }
}
