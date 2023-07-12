package problems.p0300_0400.p0312_burst_balloons;

class Solution {
    public int maxCoins(int[] nums) {
        final int n = nums.length;
        int[] balloons = new int[n + 2];
        balloons[0] = 1;
        balloons[n + 1] = 1;
        System.arraycopy(nums, 0, balloons, 1, n);
        int[][] dp = new int[balloons.length][balloons.length];
        for (int len = 2; len < balloons.length; len++) {
            for (int left = 0; left < balloons.length - len; left++) {
                int right = left + len;
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] =
                        Math.max(dp[left][right], balloons[left] * balloons[i] * balloons[right]
                            + dp[left][i] + dp[i][right]);
                }
            }
        }
        return dp[0][n + 1];
    }
}
