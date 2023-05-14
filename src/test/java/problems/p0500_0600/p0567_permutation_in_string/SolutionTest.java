package problems.p0500_0600.p0567_permutation_in_string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void checkInclusion1() {
        assertTrue(new Solution().checkInclusion("ab", "eidbaooo"));
    }
    @Test
    void checkInclusion2() {
        assertFalse(new Solution().checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void checkInclusion3() {
        assertFalse(new Solution().checkInclusion("abasdf", "ba"));
    }

}