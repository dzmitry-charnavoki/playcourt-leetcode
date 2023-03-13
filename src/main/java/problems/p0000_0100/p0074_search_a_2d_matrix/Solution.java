package problems.p0000_0100.p0074_search_a_2d_matrix;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        // since we have ordered rows - if handle them as liner array -
        // it could be done in one BS loop
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m * n;
        while (l <= r) {
            int mid = (l + r) / 2;
            // convert to linear
            int i = mid / n;
            int j = mid % n;
            if (target == matrix[i][j]) {
                return true;
            } else if (target > matrix[i][j]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

}
