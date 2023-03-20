package problems.p0000_0100.p0079_word_search;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void exist1() {
        char[][] data = new char[][] {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        assertTrue(new Solution().exist(data, "SEE"));
    }

    @Test
    void exist2() {
        char[][] data = new char[][] {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        assertFalse(new Solution().exist(data, "ABCB"));
    }

    @Test
    void exist3() {
        char[][] data = new char[][] {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        assertTrue(new Solution().exist(data, "ASADE"));
    }

    @Test
    void exist4() {
        char[][] data = new char[][] {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        assertTrue(new Solution().exist(data, "DECF"));
    }


}