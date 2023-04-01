package problems.p0000_0100.p0089_gray_code;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void grayCode1() {
        assertEquals(List.of(0, 1, 3, 2), new Solution().grayCode(2));
    }

    @Test
    void grayCode2() {
        assertEquals(List.of(0, 1, 3, 2, 6, 7, 5, 4), new Solution().grayCode(3));
    }

    @Test
    void grayCode3() {
        assertEquals(List.of(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8),
            new Solution().grayCode(4));
    }

    @Test
    void grayCode4() {
        assertEquals(List.of(0, 1), new Solution().grayCode(1));
    }
}