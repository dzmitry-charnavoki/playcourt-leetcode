package problems.p0000_0100.p0079_word_search;

class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int wordIndex) {
        if (i < 0 || i == board.length || j < 0 || j == board[0].length) {
            return false;
        }
        if (board[i][j] == '✓' || board[i][j] != word.charAt(wordIndex)) {
            return false;
        }
        if (wordIndex == word.length() - 1) {
            return true;
        }

        final char cache = board[i][j];
        board[i][j] = '✓';
        final boolean isExist = dfs(board, word, i + 1, j, wordIndex + 1)
            || dfs(board, word, i - 1, j, wordIndex + 1)
            || dfs(board, word, i, j + 1, wordIndex + 1)
            || dfs(board, word, i, j - 1, wordIndex + 1);
        board[i][j] = cache;

        return isExist;
    }
}
