package problems.p0800_0900.p0879_profitable_schemes;

class Solution {
    // https://emre.me/coding-patterns/knapsack/
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        final int kMod = 1_000_000_007;
        int[][] dp = new int[n + 1][minProfit + 1];

        for (int i = 0; i <= n; ++i) {
            dp[i][0] = 1;
        }

        for (int k = 1; k <= group.length; ++k) {
            final int g = group[k - 1];
            final int p = profit[k - 1];
            for (int i = n; i >= g; --i) {
                for (int j = minProfit; j >= 0; --j) {
                    dp[i][j] += dp[i - g][Math.max(0, j - p)];
                    dp[i][j] %= kMod;
                }
            }
        }

        return dp[n][minProfit];
    }
}
