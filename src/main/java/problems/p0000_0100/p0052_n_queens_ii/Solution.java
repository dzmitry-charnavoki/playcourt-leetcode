package problems.p0000_0100.p0052_n_queens_ii;

import java.util.Arrays;

class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        place(0, 0, 0, 0, board);
        return count;
    }

    private void place(int i, int vert, int leftDiag, int rightDiag, char[][] board) {
        int n = board.length;
        if (i == n) {
            count++;
            return;
        }
        for (int j = 0; j < n; j++) {
            int verticalMask = 1 << j;
            int leftMask = 1 << (i + j); // ↙ left-downward
            int rightMask = 1 << (j - i + n - 1); // ↘ right-downward
            if ((vert & verticalMask) + (leftDiag & leftMask) + (rightDiag & rightMask) > 0) {
                continue;
            }
            board[i][j] = 'Q';
            place(i + 1, vert | verticalMask, leftDiag | leftMask, rightDiag | rightMask,
                board);
            board[i][j] = '.';
        }
    }

}
