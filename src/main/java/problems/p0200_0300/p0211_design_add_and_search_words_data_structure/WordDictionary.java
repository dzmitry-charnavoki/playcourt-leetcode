package problems.p0200_0300.p0211_design_add_and_search_words_data_structure;

class WordDictionary {

    private TrieNode root = new TrieNode();

    public WordDictionary() {

    }

    public void addWord(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            final int i = c - 'a';
            if (cur.children[i] == null) {
                cur.children[i] = new TrieNode();
            }
            cur = cur.children[i];
        }
        cur.isEndOfWord = true;
    }

    public boolean search(String word) {
        return dfs(0, root, word);
    }

    private boolean dfs(int j, TrieNode node, String word) {
        TrieNode cur = node;

        for (int i = j; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (TrieNode child : cur.children) {
                    if (child != null && dfs(i + 1, child, word)) {
                        return true;
                    }
                }
                return false;
            } else {
                final int index = c - 'a';
                if (cur.children[index] == null) {
                    return false;
                }
                cur = cur.children[index];
            }
        }
        return cur.isEndOfWord;
    }


    static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isEndOfWord = false;
    }
}
