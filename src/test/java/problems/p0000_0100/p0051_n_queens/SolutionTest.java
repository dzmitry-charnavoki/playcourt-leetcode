package problems.p0000_0100.p0051_n_queens;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void solveNQueens_n4() {
        List<List<String>> actual =
            new Solution().solveNQueens(4);
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {".Q..", "...Q", "Q...", "..Q."},
            {"..Q.", "Q...", "...Q", ".Q.."}
        });

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void solveNQueens_n5() {
        List<List<String>> actual =
            new Solution().solveNQueens(5);
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {"Q....", "..Q..", "....Q", ".Q...", "...Q."},
            {"Q....", "...Q.", ".Q...", "....Q", "..Q.."},
            {".Q...", "...Q.", "Q....", "..Q..", "....Q"},
            {".Q...", "....Q", "..Q..", "Q....", "...Q."},
            {"..Q..", "Q....", "...Q.", ".Q...", "....Q"},
            {"..Q..", "....Q", ".Q...", "...Q.", "Q...."},
            {"...Q.", "Q....", "..Q..", "....Q", ".Q..."},
            {"...Q.", ".Q...", "....Q", "..Q..", "Q...."},
            {"....Q", ".Q...", "...Q.", "Q....", "..Q.."},
            {"....Q", "..Q..", "Q....", "...Q.", ".Q..."}

        });

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void solveNQueens_n6() {
        List<List<String>> actual =
            new Solution().solveNQueens(6);
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {".Q....", "...Q..", ".....Q", "Q.....", "..Q...", "....Q."},
            {"..Q...", ".....Q", ".Q....", "....Q.", "Q.....", "...Q.."},
            {"...Q..", "Q.....", "....Q.", ".Q....", ".....Q", "..Q..."},
            {"....Q.", "..Q...", "Q.....", ".....Q", "...Q..", ".Q...."}
        });

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void solveNQueensX() {
        assertEquals(352, new Solution().solveNQueens(9).size());
    }

    @Test
    void solveNQueens3() {
        List<List<String>> actual =
            new Solution().solveNQueens(1);
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {"Q"}
        });

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}