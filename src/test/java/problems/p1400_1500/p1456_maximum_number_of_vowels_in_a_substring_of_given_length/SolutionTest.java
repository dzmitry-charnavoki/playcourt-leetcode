package problems.p1400_1500.p1456_maximum_number_of_vowels_in_a_substring_of_given_length;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxVowels1() {
        assertEquals(3, new Solution().maxVowels("abciiidef", 3));
    }
    @Test
    void maxVowels2() {
        assertEquals(2, new Solution().maxVowels("aeiou", 2));
    }
    @Test
    void maxVowels3() {
        assertEquals(2, new Solution().maxVowels("leetcode", 3));
    }
    @Test
    void maxVowels4() {
        assertEquals(1, new Solution().maxVowels("novowels", 1));
    }
}