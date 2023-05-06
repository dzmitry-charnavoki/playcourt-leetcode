package problems.p1400_1500.p1498_number_of_subsequences_that_satisfy_the_given_sum_condition;

import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        final int modulo = 1_000_000_007;
        Arrays.sort(nums);
        int r = nums.length - 1;
        int l = 0;
        int res = 0;
        // pows[i] means (2^i) % mod
        // (int) Math.pow(2, r - l); - has limited precision.
        // As a result, for very large exponents, the computed result may not be accurate
        int[] pows = new int[nums.length]; // pows[i] = 2^i % kMod
        pows[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            pows[i] = pows[i - 1] * 2 % modulo;
        }

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                res += pows[r - l];
                res %= modulo;
                ++l;
            } else {
                --r;
            }
        }

        return res;
    }
}
