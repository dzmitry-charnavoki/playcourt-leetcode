package problems.p0200_0300.p0242_valid_anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isAnagram1() {
        assertTrue(new Solution().isAnagram("anagram",   "nagaram"));
    }

    @Test
    void isAnagram2() {
        assertFalse(new Solution().isAnagram("rat",   "car"));
    }
    @Test
    void isAnagram3() {
        assertFalse(new Solution().isAnagram("aacc",   "ccac"));
    }
    @Test
    void isAnagram4() {
        assertFalse(new Solution().isAnagram("cc",   "ccac"));
    }    
    @Test
    void isAnagram5() {
        assertFalse(new Solution().isAnagram("cc",   "ccac"));
    }

}