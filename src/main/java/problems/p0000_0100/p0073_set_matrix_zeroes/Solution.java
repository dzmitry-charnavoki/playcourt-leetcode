package problems.p0000_0100.p0073_set_matrix_zeroes;

class Solution {
    //
    // 0 1 2 0
    // 3 4 5 2
    // 1 3 1 5
    //
    public void setZeroes(int[][] matrix) {

        boolean col0 = false;
        boolean row0 = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        row0 = true;
                    }
                    if (j == 0) {
                        col0 = true;
                    }
                    if (i != 0) {
                        matrix[i][0] = 0;
                    }
                    if (j != 0) {
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        //
        // 0 1 2 0
        // 3 4 5 2
        // 1 3 1 5
        //
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix[0][j] == 0
                    || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
                if (row0 && i == 0) { // if first row
                    matrix[i][j] = 0;
                }
                if (col0 && j == 0) { // if first col
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
