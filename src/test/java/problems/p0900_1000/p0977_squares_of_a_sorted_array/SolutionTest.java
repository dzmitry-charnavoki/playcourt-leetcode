package problems.p0900_1000.p0977_squares_of_a_sorted_array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sortedSquares11() {
        assertArrayEquals(new int[] {0,1,9,16,100}, new Solution().sortedSquares(new int[] {-4,-1,0,3,10}));
    }

    @Test
    void sortedSquares12() {
        assertArrayEquals(new int[] {4,9,9,49,121}, new Solution().sortedSquares(new int[] {-7,-3,2,3,11}));
    }

    @Test
    void sortedSquares21() {
        assertArrayEquals(new int[] {0,1,9,16,100}, new Solution().sortedSquares1(new int[] {-4,-1,0,3,10}));
    }

    @Test
    void sortedSquares22() {
        assertArrayEquals(new int[] {4,9,9,49,121}, new Solution().sortedSquares1(new int[] {-7,-3,2,3,11}));
    }
}