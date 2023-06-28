package problems.p0100_0200.p0198_house_robber;

class Solution {
    public int rob(int[] nums) {
        int rob1 = 0; // dp[i - 1]
        int rob2 = 0; // dp[i - 2]

        //rob1, rob2, n, n+1
        for (final int n : nums) {
            final int tmp = Math.max(rob1 + n, rob2);
            rob1 = rob2;
            rob2 = tmp;
        }
        return rob2;
    }
}
