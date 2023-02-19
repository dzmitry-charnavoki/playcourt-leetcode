package problems.p0000_0100.p0051_n_queens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // dfs, backtracking, bit manipulation


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        place(0, 0, 0, 0, board, ans);
        return ans;
    }

    private void place(int i, int vert, int leftDiag, int rightDiag, char[][] board,
                       List<List<String>> ans) {
        int n = board.length;
        if (i == n) {
            ans.add(construct(board));
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
                board, ans);
            board[i][j] = '.';
        }
    }

    private List<String> construct(char[][] board) {
        List<String> listBoard = new ArrayList<>();
        for (int i = 0; i < board.length; ++i) {
            listBoard.add(String.valueOf(board[i]));
        }
        return listBoard;
    }

}
