package problems.p1500_1600.p1572_matrix_diagonal_sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void diagonalSum() {
        assertEquals(25,
            new Solution().diagonalSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void diagonalSum2() {
        assertEquals(8,
            new Solution()
                .diagonalSum(
                    new int[][] {
                        {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}
                    }));
    }

    @Test
    void diagonalSum3() {
        assertEquals(5, new Solution().diagonalSum(new int[][] {{5}}));
    }

}