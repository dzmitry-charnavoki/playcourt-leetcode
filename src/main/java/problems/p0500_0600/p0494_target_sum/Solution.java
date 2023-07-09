package problems.p0500_0600.p0494_target_sum;

import java.util.Arrays;

class Solution {
    /*
    P sum of positive numbers.
    N sum of negative numbers.
    P+N = sum
    P-N = target
    after sum both statmetns
    2P = sum + target
    (sum + target) / 2 will give us a fractional number in case of sum + target is odd.
    However, P must be an integer
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if (sum < Math.abs(target) || (sum + target) % 2 == 1) {
            return 0;
        }
        return knapsack(nums, (sum + target) / 2);
    }

    private int knapsack(int[] nums, int total) {
        final int n = nums.length;
        int[][] dp = new int[n + 1][total + 1];
        dp[0][0] = 1; // there is only one way to achive 0 sum, do not take anything

        for (int i = 1; i <= n; i++) { // <= as we use + 1 row in dp
            final int num = nums[i - 1];
            for (int j = 0; j <= total; j++) { // <= as we use + 1 col in dp
                if (j < num) {
                    // we cannot use current number (num), just use a value from previous step
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - num];
                }
            }
        }
        return dp[n][total];
    }

    private int count = 0;

    public int findTargetSumWays2(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if (sum < Math.abs(target) || (sum + target) % 2 == 1) {
            return 0;
        }
        backtracking(nums, target, 0, 0);
        return count;
    }

    private void backtracking(int[] nums, int target, int sum, int i) {
        if (i == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backtracking(nums, target, sum + nums[i], i + 1);
            backtracking(nums, target, sum - nums[i], i + 1);
        }
    }

}
