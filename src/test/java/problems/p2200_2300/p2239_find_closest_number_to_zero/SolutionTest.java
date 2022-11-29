package problems.p2200_2300.p2239_find_closest_number_to_zero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution test = new Solution();

    @Test
    void findClosestNumber() {
        assertEquals(-100000, test.findClosestNumber(new int[] {-100000, -100000}));
        assertEquals(1, test.findClosestNumber(new int[] {-4, -2, 1, 4, 8}));
        assertEquals(1, test.findClosestNumber(new int[] {2, -1, 1}));
    }

}