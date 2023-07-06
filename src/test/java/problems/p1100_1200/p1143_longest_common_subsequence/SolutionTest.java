package problems.p1100_1200.p1143_longest_common_subsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestCommonSubsequence1() {
        assertEquals(3, new Solution().longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void longestCommonSubsequence2() {
        assertEquals(3, new Solution().longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void longestCommonSubsequence3() {
        assertEquals(0, new Solution().longestCommonSubsequence("abc", "def"));
    }

}