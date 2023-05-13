package problems.p0400_0500.p0424_longest_repeating_character_replacement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void characterReplacement1() {
        assertEquals(4, new Solution().characterReplacement("ABAB", 2));
    }

    @Test
    void characterReplacement2() {
        assertEquals(4, new Solution().characterReplacement("AABABBA", 1));
    }

    @Test
    void characterReplacement3() {
        assertEquals(3, new Solution().characterReplacement("ABA", 3));
    }

}