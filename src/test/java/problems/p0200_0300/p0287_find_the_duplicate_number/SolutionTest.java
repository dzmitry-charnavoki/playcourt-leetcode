package problems.p0200_0300.p0287_find_the_duplicate_number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findDuplicate1() {
        assertEquals(2, new Solution().findDuplicate(new int[] {1, 3, 4, 2, 2}));
    }

    @Test
    void findDuplicate2() {
        assertEquals(3, new Solution().findDuplicate(new int[] {3, 1, 3, 4, 2}));
    }

    @Test
    void findDuplicate3() {
        assertEquals(5, new Solution().findDuplicate(new int[] {5, 2, 1, 5, 3, 4, 6}));
    }

    @Test
    void findDuplicate21() {
        assertEquals(2, new Solution().findDuplicatePigeonhole(new int[] {1, 3, 4, 2, 2}));
    }

    @Test
    void findDuplicate22() {
        assertEquals(3, new Solution().findDuplicatePigeonhole(new int[] {3, 1, 3, 4, 2}));
    }

    @Test
    void findDuplicate23() {
        assertEquals(5,
            new Solution().findDuplicatePigeonhole(new int[] {5, 2, 1, 5, 3, 4, 6}));
    }

    @Test
    void findDuplicate24() {
        assertEquals(13,
            new Solution().findDuplicatePigeonhole(
                new int[] {13, 46, 8, 11, 20, 17, 40, 13, 13, 13, 14, 1, 13, 36, 48, 41, 13, 13, 13,
                    13, 45, 13, 28, 42, 13, 10, 15, 22, 13, 13, 13, 13, 23, 9, 6, 13, 47, 49, 16,
                    13, 13, 39, 35, 13, 32, 29, 13, 25, 30, 13}));
    }

    @Test
    void findDuplicate25() {
        assertEquals(-1, new Solution().findDuplicatePigeonhole(new int[] {5, 2, 1, 3, 4, 6}));
    }

    @Test
    void findDuplicate31() {
        assertEquals(2, new Solution().findDuplicateBitSet(new int[] {1, 3, 4, 2, 2}));
    }

    @Test
    void findDuplicate32() {
        assertEquals(3, new Solution().findDuplicateBitSet(new int[] {3, 1, 3, 4, 2}));
    }

    @Test
    void findDuplicate33() {
        assertEquals(5,
            new Solution().findDuplicateBitSet(new int[] {5, 2, 1, 5, 3, 4, 6}));
    }

    @Test
    void findDuplicate34() {
        assertEquals(13,
            new Solution().findDuplicateBitSet(
                new int[] {13, 46, 8, 11, 20, 17, 40, 13, 13, 13, 14, 1, 13, 36, 48, 41, 13, 13, 13,
                    13, 45, 13, 28, 42, 13, 10, 15, 22, 13, 13, 13, 13, 23, 9, 6, 13, 47, 49, 16,
                    13, 13, 39, 35, 13, 32, 29, 13, 25, 30, 13}));
    }

    @Test
    void findDuplicate35() {
        assertEquals(-1, new Solution().findDuplicateBitSet(new int[] {5, 2, 1, 3, 4, 6}));
    }
}