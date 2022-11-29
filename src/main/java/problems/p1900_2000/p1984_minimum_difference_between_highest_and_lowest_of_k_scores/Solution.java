package problems.p1900_2000.p1984_minimum_difference_between_highest_and_lowest_of_k_scores;

import java.util.Arrays;

class Solution {

    /**
     * https://itnext.io/sliding-window-algorithm-technique-6001d5fbe8b3
     * #Easy #Array #Sorting #Sliding_Window
     */
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = nums[nums.length - 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
        }
        return minDiff;
    }

}