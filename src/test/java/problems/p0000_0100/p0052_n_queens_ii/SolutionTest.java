package problems.p0000_0100.p0052_n_queens_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void totalNQueens1() {
        assertEquals(1, new Solution().totalNQueens(1));
    }
    @Test
    void totalNQueens2() {
        assertEquals(0, new Solution().totalNQueens(2));
    }
    @Test
    void totalNQueens3() {
        assertEquals(0, new Solution().totalNQueens(3));
    }
    @Test
    void totalNQueens4() {
        assertEquals(2, new Solution().totalNQueens(4));
    }
    @Test
    void totalNQueens5() {
        assertEquals(10, new Solution().totalNQueens(5));
    }
    @Test
    void totalNQueens6() {
        assertEquals(4, new Solution().totalNQueens(6));
    }
    @Test
    void totalNQueens7() {
        assertEquals(40, new Solution().totalNQueens(7));
    }
    @Test
    void totalNQueens8() {
        assertEquals(92, new Solution().totalNQueens(8));
    }
    @Test
    void totalNQueens9() {
        assertEquals(352, new Solution().totalNQueens(9));
    }
}