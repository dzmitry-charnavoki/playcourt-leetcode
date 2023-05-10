package problems.p0100_0200.p0128_longest_consecutive_sequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestConsecutive1() {
        assertEquals(4, new Solution().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    @Test
    void longestConsecutive2() {
        assertEquals(9,
            new Solution().longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

}