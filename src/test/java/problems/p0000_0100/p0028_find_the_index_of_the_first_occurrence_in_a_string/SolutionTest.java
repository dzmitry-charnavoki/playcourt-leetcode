package problems.p0000_0100.p0028_find_the_index_of_the_first_occurrence_in_a_string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void strStr1() {
        assertEquals(0, new Solution().strStr("sadbutsad", "sad"));
    }

    @Test
    void strStr2() {
        assertEquals(-1, new Solution().strStr("leetcode", "leeto"));
    }

    @Test
    void strStr3() {
        assertEquals(-1, new Solution().strStr("code", "leetcode"));
    }

    @Test
    void strStr31() {
        assertEquals(0, new Solution().strStr("code", ""));
    }

    @Test
    void strStr4() {
        assertEquals(3, new Solution().strStr("Darova", "ov"));
    }

    @Test
    void strStr5() {
        assertEquals(5, new Solution().strStr("avdsvfbbrethjq", "f"));
    }
    @Test
    void strStr6() {
        assertEquals(-1, new Solution().strStr("mississippi", "issipi"));
    }

}