package problems.p0000_0100.p0059_spiral_matrix_ii;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int l = 0;
        int r = n - 1;
        int t = 0;
        int b = n - 1;
        int c = 1;
        while (l <= r) {
            for (int i = l; i <= r; i++) {
                ans[t][i] = c++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                ans[i][r] = c++;
            }
            r--;
            if (l <= r) {
                for (int i = r; i >= l; i--) {
                    ans[b][i] = c++;
                }
                b--;
                for (int i = b; i >= t; i--) {
                    ans[i][l] = c++;
                }
                l++;
            }
        }
        return ans;
    }
}
