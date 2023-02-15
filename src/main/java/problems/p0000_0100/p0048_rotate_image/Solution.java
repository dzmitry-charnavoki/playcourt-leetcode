package problems.p0000_0100.p0048_rotate_image;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int depth = n / 2; // or level
        for (int i = 0; i < depth; i++) {
            int len = n - 2 * i - 1;
            int opp = n - 1 - i;
            for (int j = 0; j < len; j++) {
                final int temp = matrix[i][i + j];
                matrix[i][i + j] = matrix[opp - j][i];
                matrix[opp - j][i] = matrix[opp][opp - j];
                matrix[opp][opp - j] = matrix[i + j][opp];
                matrix[i + j][opp] = temp;
            }
        }
    }
}
