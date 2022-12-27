package problems.p0000_0100.p0003_longest_substring_without_repeating_characters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring1() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring2() {
        assertEquals(1, new Solution().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void lengthOfLongestSubstring3() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void lengthOfLongestSubstring4() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("pwwke"));
    }

    @Test
    void lengthOfLongestSubstring5() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("dvdf"));
    }

}