package problems.p0000_0100.p0026_remove_duplicates_from_sorted_array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void removeDuplicates1() {
        int k = 2;
        int[] act = new int[] {1, 1, 2};

        assertEquals(k, new Solution().removeDuplicates(act));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {1, 2}, res);
    }

    @Test
    void removeDuplicates2() {
        int k = 5;
        int[] act = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        assertEquals(k, new Solution().removeDuplicates(act));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {0,1,2,3,4}, res);
    }

    @Test
    void removeDuplicates3() {
        int k = 1;
        int[] act = new int[] {0};

        assertEquals(k, new Solution().removeDuplicates(act));
        int[] res = Arrays.copyOf(act, k);

        assertArrayEquals(new int[] {0}, res);
    }

}