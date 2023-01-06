package problems.p0000_0100.p0016_3sum_closest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum;
        int closest = nums[0] + nums[1] + nums[n - 1];
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(closest - target) > Math.abs(sum - target)) {
                    closest = sum;
                }
                if (sum == target) {
                    return sum;
                }
                if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return closest;
    }
}
