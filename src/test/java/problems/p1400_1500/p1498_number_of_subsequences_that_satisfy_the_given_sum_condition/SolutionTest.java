package problems.p1400_1500.p1498_number_of_subsequences_that_satisfy_the_given_sum_condition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numSubseq1() {
        assertEquals(4, new Solution().numSubseq(new int[] {3, 5, 6, 7}, 9));
    }

    @Test
    void numSubseq2() {
        assertEquals(6, new Solution().numSubseq(new int[] {3, 3, 6, 8}, 10));
    }

    @Test
    void numSubseq3() {
        assertEquals(61, new Solution().numSubseq(new int[] {2, 3, 3, 4, 6, 7}, 12));
    }
    @Test
    void numSubseq4() {
        assertEquals(272187084, new Solution().numSubseq(new int[] {14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14}, 22));
    }

}