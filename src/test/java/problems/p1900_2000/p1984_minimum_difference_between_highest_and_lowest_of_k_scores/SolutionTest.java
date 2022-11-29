package problems.p1900_2000.p1984_minimum_difference_between_highest_and_lowest_of_k_scores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minimumDifference() {
        assertEquals(0, new Solution().minimumDifference(new int[] {90},1));
        assertEquals(2, new Solution().minimumDifference(new int[] {9,4,1,7},2));
    }

}