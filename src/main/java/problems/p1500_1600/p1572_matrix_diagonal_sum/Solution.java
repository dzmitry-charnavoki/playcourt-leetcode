package problems.p1500_1600.p1572_matrix_diagonal_sum;

class Solution {

    public int diagonalSum(int[][] mat) {
        int t = 0;
        int n = mat.length - 1;
        int m = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            t += mat[i][i];
            t += mat[i][mat.length - 1 - i];

        }
        if (n % 2 == 0) {
            t -= mat[n / 2][m / 2];
        }
        return t;
    }
}
