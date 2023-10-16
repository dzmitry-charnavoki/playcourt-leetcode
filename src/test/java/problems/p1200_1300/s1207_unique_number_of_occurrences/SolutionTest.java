package problems.p1200_1300.s1207_unique_number_of_occurrences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void uniqueOccurrences1() {
        int[] act = new int[] {1, 2, 2, 1, 1, 3};
        assertTrue(new Solution().uniqueOccurrences(act));
    }

    @Test
    void uniqueOccurrences2() {
        int[] act = new int[] {1, 2};
        assertFalse(new Solution().uniqueOccurrences(act));
    }

    @Test
    void uniqueOccurrences3() {
        int[] act = new int[] {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertTrue(new Solution().uniqueOccurrences(act));
    }

}