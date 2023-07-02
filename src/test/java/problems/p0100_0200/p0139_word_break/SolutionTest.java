package problems.p0100_0200.p0139_word_break;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void wordBreak() {
        assertTrue(new Solution().wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    void wordBreak1() {
        assertTrue(new Solution().wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    void wordBreak2() {
        assertFalse(
            new Solution().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

}