package problems.p0700_0800.p0739_daily_temperatures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void dailyTemperatures1() {
        assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0},
            new Solution().dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void dailyTemperatures2() {
        assertArrayEquals(new int[] {1, 1, 1, 0},
            new Solution().dailyTemperatures(new int[] {30, 40, 50, 60}));
    }

    @Test
    void dailyTemperatures3() {
        assertArrayEquals(new int[] {1, 1, 0},
            new Solution().dailyTemperatures(new int[] {30, 60, 90}));
    }


}