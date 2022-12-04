package problems.p1800_1900.p1832_check_if_the_sentence_is_pangram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void checkIfPangram() {
        assertEquals(true, new Solution().checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(true, new Solution().checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(true, new Solution().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        assertEquals(false, new Solution().checkIfPangram("leetcode"));


    }

    @Test
    void checkIfPangramBit() {
        assertEquals(false, new Solution().checkIfPangramBit("ercdefghijklmnopqrstuvwxyz"));
        assertEquals(true, new Solution().checkIfPangramBit("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(true, new Solution().checkIfPangramBit("thequickbrownfoxjumpsoverthelazydog"));
        assertEquals(false, new Solution().checkIfPangramBit("leetcode"));
    }
}