package problems.p0000_0100.p0027_remove_element;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void removeElement1() {
        int k = 2;
        int v = 3;
        int[] act = new int[] {3, 2, 2, 3};

        assertEquals(k, new Solution().removeElement(act, v));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {2, 2}, res);
    }

    @Test
    void removeElement2() {
        int k = 5;
        int v = 2;
        int[] act = new int[] {0,1,2,2,3,0,4,2};

        assertEquals(k, new Solution().removeElement(act, v));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {0,1,3,0,4}, res);
    }

    @Test
    void removeElement3() {
        int k = 0;
        int v = 1;
        int[] act = new int[] {1};

        assertEquals(k, new Solution().removeElement(act, v));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {}, res);
    }

    @Test
    void removeElement4() {
        int k = 0;
        int v = 1;
        int[] act = new int[] {};

        assertEquals(k, new Solution().removeElement(act, v));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {}, res);
    }
}