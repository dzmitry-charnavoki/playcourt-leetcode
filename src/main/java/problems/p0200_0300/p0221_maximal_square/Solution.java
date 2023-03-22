package problems.p0200_0300.p0221_maximal_square;

class Solution {

    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        int[] dp = new int[cols + 1];
        int prev = 0;
        int max = 0;
        for (int r = rows; r >= 0; r--) {
            for (int c = cols; c >= 0; c--) {
                final int tmp = dp[c];
                if (matrix[r][c] == '1' && c != cols) {
                    dp[c] = 1 + Math.min(prev, Math.min(dp[c], dp[c + 1]));
                } else {
                    dp[c] = Character.getNumericValue(matrix[r][c]);
                }
                max = Math.max(max, dp[c]);
                prev = tmp;
            }
        }
        return max * max;
    }


}
