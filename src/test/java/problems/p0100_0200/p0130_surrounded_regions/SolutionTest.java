package problems.p0100_0200.p0130_surrounded_regions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solve1() {
        char[][] act = new char[][] {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        char[][] exp = new char[][] {
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        new Solution().solve(act);
        assertArrayEquals(exp, act);
    }
    @Test
    void solve11() {
        char[][] act = new char[][] {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };

        char[][] exp = new char[][] {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };
        new Solution().solve(act);
        assertArrayEquals(exp, act);
    }
    @Test
    void solve2() {
        char[][] act = new char[][] {
            {'X'}
        };

        char[][] exp = new char[][] {
            {'X'}
        };
        new Solution().solve(act);
        assertArrayEquals(exp, act);
    }

}