package problems.p0400_0500.p0416_partition_equal_subset_sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canPartition() {
        assertTrue(new Solution().canPartition(new int[] {1, 5, 11, 5}));
    }

    @Test
    void canPartition2() {
        assertFalse(new Solution().canPartition(new int[] {1, 2, 3, 5}));
    }

}