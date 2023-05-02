package problems.p1800_1900.p1822_sign_of_the_product_of_an_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void arraySign1() {
        assertEquals(1, new Solution().arraySign(new int[] {-1, -2, -3, -4, 3, 2, 1}));
    }

    @Test
    void arraySign2() {
        assertEquals(0, new Solution().arraySign(new int[] {1, 5, 0, 2, -3}));
    }

    @Test
    void arraySign3() {
        assertEquals(-1, new Solution().arraySign(new int[] {-1, 1, -1, 1, -1}));
    }

    @Test
    void arraySign4() {
        assertEquals(-1, new Solution().arraySign(new int[] {
            41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43,
            83, 78, 82, 70, 15, -41
        }));
    }

}