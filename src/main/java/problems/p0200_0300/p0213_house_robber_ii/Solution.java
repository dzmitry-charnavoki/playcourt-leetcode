package problems.p0200_0300.p0213_house_robber_ii;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int l, int r) {
        int prev1 = 0;
        int prev2 = 0;
        for (int i = l; i <= r; i++) {
            final int tmp = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = tmp;
        }
        return prev2;
    }

}
