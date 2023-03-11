package problems.p0000_0100.p0071_simplify_path;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void simplifyPath1() {
        assertEquals("/home", new Solution().simplifyPath("/home/"));
    }

    @Test
    void simplifyPath2() {
        assertEquals("/", new Solution().simplifyPath("/../"));
    }

    @Test
    void simplifyPath3() {
        assertEquals("/home/foo", new Solution().simplifyPath("/home//foo/"));
    }

    @Test
    void simplifyPath31() {
        assertEquals("/home/foo", new Solution().simplifyPath("/home/./foo/"));
    }

    @Test
    void simplifyPath4() {
        assertEquals("/", new Solution().simplifyPath("/vdfv/../"));
    }

}