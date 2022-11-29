package problems.p2200_2300.p2239_find_closest_number_to_zero;

/**
 * Find Closest Number to Zero
 * Given an integer array nums of size n, return the number with the value closest to 0 in nums.
 * If there are multiple answers, return the number with the largest value.
 * https://leetcode.com/problems/find-closest-number-to-zero/
 */
class Solution {

    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(closest) > Math.abs(nums[i])) {
                closest = nums[i];
            } else if (Math.abs(closest) == Math.abs(nums[i])) {
                closest = Math.max(closest, nums[i]);
            }
        }
        return closest;
    }

}
