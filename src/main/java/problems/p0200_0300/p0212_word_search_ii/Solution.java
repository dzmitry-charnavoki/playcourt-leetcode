package problems.p0200_0300.p0212_word_search_ii;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            root.addWord(word);
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, i, j, root, ans);
            }
        }

        return ans;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> ans) {
        if (i < 0 || j < 0 || j >= board[0].length || board[i][j] == '*') {
            return;
        }

        final char c = board[i][j];
        TrieNode child = node.children[c - 'a'];
        if (child == null) {
            return;
        }
        if (child.word != null) {
            ans.add(child.word);
            child.word = null;
        }

        board[i][j] = '*';
        dfs(board, i + 1, j, child, ans);
        dfs(board, i - 1, j, child, ans);
        dfs(board, i, j + 1, child, ans);
        dfs(board, i, j - 1, child, ans);
        board[i][j] = c;

    }


    static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String word;

        private void addWord(final String word) {
            TrieNode node = this;
            for (final char c : word.toCharArray()) {
                final int i = c - 'a';
                if (node.children[i] == null) {
                    node.children[i] = new TrieNode();
                }
                node = node.children[i];
            }
            node.word = word;
        }
    }
}
