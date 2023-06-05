package problems.p0200_0300.p0208_implement_trie_prefix_tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrieTest {

    @Test
    void flow1() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertFalse(trie.search("wow"));
        assertTrue(trie.startsWith("app"));
        assertFalse(trie.startsWith("hm"));
        trie.insert("app");
        assertTrue(trie.search("app"));
    }

}