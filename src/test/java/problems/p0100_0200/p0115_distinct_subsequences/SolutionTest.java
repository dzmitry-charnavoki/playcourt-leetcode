package problems.p0100_0200.p0115_distinct_subsequences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numDistinct1() {
        assertEquals(3, new Solution().numDistinct("rabbbit","rabbit"));
    }

    @Test
    void numDistinct2() {
        assertEquals(5, new Solution().numDistinct("babgbag","bag"));
    }

}