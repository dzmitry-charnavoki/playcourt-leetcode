package problems.p0700_0800.p0796_rotate_string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void rotateString() {
        assertEquals(true, new Solution().rotateString("bbbacddceeb", "ceebbbbacdd"));
        assertEquals(true, new Solution().rotateString("abcde", "cdeab"));
    }

    @Test
    void rotateStringNegative() {
        assertEquals(false, new Solution().rotateString("", "cdeab"));
        assertEquals(false, new Solution().rotateString("abcd", "cdeab"));
        assertEquals(false, new Solution().rotateString("abcde", "abced"));
    }

    @Test
    void rotateStringDoubleA() {
        assertEquals(true, new Solution().rotateStringDoubleA("bbbacddceeb", "ceebbbbacdd"));
        assertEquals(true, new Solution().rotateStringDoubleA("abcde", "cdeab"));
    }

    @Test
    void rotateStringDoubleANegative() {
        assertEquals(false, new Solution().rotateStringDoubleA("", "cdeab"));
        assertEquals(false, new Solution().rotateStringDoubleA("abcd", "cdeab"));
        assertEquals(false, new Solution().rotateStringDoubleA("abcde", "abced"));
    }
}