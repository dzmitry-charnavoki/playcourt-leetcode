package problems.p0000_0100.p0062_unique_paths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void uniquePaths1() {
        assertEquals(28, new Solution().uniquePaths(3, 7));
    }

    @Test
    void uniquePaths2() {
        assertEquals(3, new Solution().uniquePaths(2, 3));
    }
    @Test
    void uniquePaths3() {
        assertEquals(1916797311, new Solution().uniquePaths(51, 9));
    }

    @Test
    void uniquePaths_s1() {
        assertEquals(28, new Solution().uniquePaths2(3, 7));
    }

    @Test
    void uniquePaths_s2() {
        assertEquals(3, new Solution().uniquePaths2(2, 3));
    }

//    @Test
//    void uniquePaths_s3() {
//        assertEquals(1916797311, new Solution().uniquePaths2(51, 9));
//    }

    @Test
    void uniquePaths_s31() {
        assertEquals(28, new Solution().uniquePaths3(3, 7));
    }
    @Test
    void uniquePaths_s32() {
        assertEquals(3, new Solution().uniquePaths3(2, 3));
    }

    @Test
    void uniquePaths_s33() {
        assertEquals(1916797311, new Solution().uniquePaths3(51, 9));
    }
}