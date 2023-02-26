package problems.p0000_0100.p0060_permutation_sequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isNumber_1() {
        assertEquals("213", new Solution().getPermutation(3, 3));
    }

    @Test
    void isNumber_2() {
        assertEquals("2314", new Solution().getPermutation(4, 9));
    }

    @Test
    void isNumber_3() {
        assertEquals("123", new Solution().getPermutation(3, 1));
    }

}