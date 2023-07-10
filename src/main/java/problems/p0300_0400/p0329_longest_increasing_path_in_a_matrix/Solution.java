package problems.p0300_0400.p0329_longest_increasing_path_in_a_matrix;

class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;
        int[][] memo = new int[rows][cols];
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // we can use -1 as prev instead of Integer.MIN_VALUE due to existing constrain
                ans = Math.max(ans, dfs(matrix, i, j, -1, memo));
            }
        }
        return ans;
    }

    private int dfs(int[][] matrix, int i, int j, int prev, int[][] memo) {
        if (i < 0 || i == matrix.length || j < 0 || j == matrix[0].length) {
            return 0;
        }
        if (matrix[i][j] <= prev) {
            return 0;
        }
        if (memo[i][j] > 0) {
            return memo[i][j];
        }
        final int current = matrix[i][j];
        final int l = dfs(matrix, i, j - 1, current, memo);
        final int r = dfs(matrix, i, j + 1, current, memo);
        final int u = dfs(matrix, i - 1, j, current, memo);
        final int d = dfs(matrix, i + 1, j, current, memo);
        memo[i][j] = 1 + Math.max(Math.max(u, d), Math.max(l, r));
        return memo[i][j];
    }
}
