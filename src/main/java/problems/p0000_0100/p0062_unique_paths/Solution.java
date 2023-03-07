package problems.p0000_0100.p0062_unique_paths;

import java.util.Arrays;

class Solution {

    // top-down
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    // bottom-up
    // does not fit here due exceed time of execution
    // to slow? stack too big?
    public int uniquePaths2(int m, int n) {
        return up(m - 1, n - 1);
    }

    private int up(int i, int j) {
        if (i == 0 || j == 0) {
            return 1;
        }
        return up(i, j - 1) + up(i - 1, j);
    }

    public int uniquePaths3(int m, int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);

        for (int r = m - 1; r > 0; r--) {
            int[] newRow = new int[n];
            Arrays.fill(newRow, 1);
            for (int c = n - 2; c >= 0; c--) {
                newRow[c] = newRow[c + 1] + row[c];
            }
            row = newRow;
        }
        return row[0];

    }


}
