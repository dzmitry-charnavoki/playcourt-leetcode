package problems.p0000_0100.p0054_spiral_matrix;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void spiralOrder1() {
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
            new Solution()
                .spiralOrder(new int[][] {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                }));
    }

    @Test
    void spiralOrder2() {
        assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
            new Solution()
                .spiralOrder(new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
                }));
    }

    @Test
    void spiralOrder3() {
        assertEquals(List.of(1, 2, 4, 3), new Solution()
            .spiralOrder(new int[][] {
                {1, 2},
                {3, 4}
            }));
    }

    @Test
    void spiralOrder4() {
        assertEquals(List.of(1, 2, 3, 4, 8, 7, 6, 5), new Solution()
            .spiralOrder(new int[][] {
                {1, 2, 3, 4}, {5, 6, 7, 8}
            }));
    }

    @Test
    void spiralOrder5() {
        assertEquals(List.of(1, 2, 4, 6, 8, 7, 5, 3),
            new Solution()
                .spiralOrder(new int[][] {
                    {1, 2},
                    {3, 4},
                    {5, 6},
                    {7, 8}
                }));
    }

    @Test
    void spiralOrder6() {
        assertEquals(List.of(), new Solution().spiralOrder(new int[][] {{}}));
    }
}