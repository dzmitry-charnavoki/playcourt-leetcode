package problems.p0000_0100.p0058_length_of_last_word;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void lengthOfLastWord1() {
        assertEquals(5, new Solution().lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWord2() {
        assertEquals(4, new Solution().lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfLastWord3() {
        assertEquals(6, new Solution().lengthOfLastWord("luffy is still joyboy"));
    }
}