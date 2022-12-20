package problems.p0000_0100.p0014_longest_common_prefix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestCommonPrefix1() {
        assertEquals("fl",
            new Solution().longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
    }

    @Test
    void longestCommonPrefix2() {
        assertEquals("",
            new Solution().longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }

    @Test
    void longestCommonPrefix3() {
        assertEquals("ab",
            new Solution().longestCommonPrefix(new String[] {"abb","abc"}));
    }

    @Test
    void longestCommonPrefix4() {
        assertEquals("d",
            new Solution().longestCommonPrefix(new String[] {"d"}));
    }

    @Test
    void longestCommonPrefix5() {
        assertEquals("",
            new Solution().longestCommonPrefix(new String[] {""}));
    }

    @Test
    void longestCommonPrefix6() {
        assertEquals("",
            new Solution().longestCommonPrefix(new String[] {"",""}));
    }

    @Test
    void longestCommonPrefix7() {
        assertEquals("c",
            new Solution().longestCommonPrefix(new String[] {"c","c"}));
    }

    @Test
    void longestCommonPrefix8() {
        assertEquals("c",
            new Solution().longestCommonPrefix(new String[] {"c","cdd"}));
    }
}