package problems.p0200_0300.p0239_sliding_window_maximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxSlidingWindow1() {
        assertArrayEquals(new int[] {3, 3, 5, 5, 6, 7}, new Solution()
            .maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    void maxSlidingWindow2() {
        assertArrayEquals(new int[] {1}, new Solution()
            .maxSlidingWindow(new int[] {1}, 1));
    }

}