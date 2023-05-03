package problems.p0600_0700.p0684_redundant_connection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findRedundantConnectio1() {
        assertArrayEquals(new int[] {2, 3}, new Solution()
            .findRedundantConnection(new int[][] {
                {1, 2}, {1, 3}, {2, 3}
            }));
    }

    @Test
    void findRedundantConnectio2() {
        assertArrayEquals(new int[] {1, 4}, new Solution()
            .findRedundantConnection(new int[][] {
                {1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}
            }));
    }

    @Test
    void findRedundantConnectio3() {
        assertArrayEquals(new int[] {}, new Solution()
            .findRedundantConnection(new int[][] {
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {0, 1}
            }));
    }

}