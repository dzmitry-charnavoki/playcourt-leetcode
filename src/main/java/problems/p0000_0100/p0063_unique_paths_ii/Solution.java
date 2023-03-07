package problems.p0000_0100.p0063_unique_paths_ii;

class Solution {

    // #Time: O(N*M), Space O(N)
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n]; // in place
        dp[n - 1] = 1;
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (obstacleGrid[r][c] == 1) {
                    dp[c] = 0;
                } else if (c + 1 < n) {
                    dp[c] = dp[c] + dp[c + 1];
                }
            }
        }
        return dp[0];
    }

}
