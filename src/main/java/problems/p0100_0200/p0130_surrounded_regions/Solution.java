package problems.p0100_0200.p0130_surrounded_regions;

class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i * j == 0 || i == r - 1 || j == c - 1) {
                    dfs(board, i, j);
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r == board.length || c < 0 || c == board[0].length) {
            return;
        }
        if (board[r][c] != 'O') {
            return;
        }
        board[r][c] = '*';
        dfs(board, r + 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
        dfs(board, r - 1, c);
    }
}
