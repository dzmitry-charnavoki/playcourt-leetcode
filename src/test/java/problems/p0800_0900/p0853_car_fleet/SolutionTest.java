package problems.p0800_0900.p0853_car_fleet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void carFleet1() {
        assertEquals(3, new Solution()
            .carFleet(12, new int[] {10, 8, 0, 5, 3}, new int[] {2, 4, 1, 1, 3}));
    }

    @Test
    void carFleet2() {
        assertEquals(1, new Solution()
            .carFleet(10, new int[] {3}, new int[] {3}));
    }

    @Test
    void carFleet3() {
        assertEquals(1, new Solution()
            .carFleet(100, new int[] {0, 2, 4}, new int[] {4, 2, 1}));
    }
}