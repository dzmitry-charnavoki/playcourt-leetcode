package problems.p0200_0300.p0212_word_search_ii;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findWords() {
        char[][] board = {
            {'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = new ArrayList<>();
        expected.add("oath");
        expected.add("eat");
        assertEquals(expected, new Solution().findWords(board, words));
    }

    @Test
    void findWords1() {
        char[][] board = {
            {'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "peat"};
        List<String> expected = new ArrayList<>();
        expected.add("oath");
        expected.add("eat");
        assertEquals(expected, new Solution().findWords(board, words));
    }

    @Test
    void findWords2() {
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        String[] words = {"abcb"};
        assertEquals(0, new Solution().findWords(board, words).size());
    }

    @Test
    void findWords3() {
        char[][] board = {};
        String[] words = {};
        assertEquals(0, new Solution().findWords(board, words).size());
    }
}