package problems.p0300_0400.p0347_top_k_frequent_elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void topKFrequent1() {
        assertArrayEquals(new int[] {1, 2},
            new Solution().topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    void topKFrequent2() {
        assertArrayEquals(new int[] {1},
            new Solution().topKFrequent(new int[] {1}, 1));
    }

}