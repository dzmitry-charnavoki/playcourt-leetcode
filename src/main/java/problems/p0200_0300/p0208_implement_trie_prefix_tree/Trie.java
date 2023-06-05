package problems.p0200_0300.p0208_implement_trie_prefix_tree;

class Trie {
    private TrieNode root = new TrieNode();

    public Trie() {

    }

    public void insert(String word) {
        TrieNode cur = root;
        for (final char c : word.toCharArray()) {
            final int i = c - 'a';
            if (cur.children[i] == null) {
                cur.children[i] = new TrieNode();
            }
            cur = cur.children[i];
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.endOfWord;

    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private TrieNode find(String prefix) {
        TrieNode cur = root;
        for (final char c : prefix.toCharArray()) {
            final int i = c - 'a';
            if (cur.children[i] == null) {
                return null;
            }
            cur = cur.children[i];
        }
        return cur;
    }

    static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean endOfWord = false;
    }
}
