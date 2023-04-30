package problems.p0100_0200.p0108_convert_sorted_array_to_binary_search_tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sortedArrayToBST1() {
        assertEquals("[0, -10, 5, null, -3, null, 9]",
            new Solution()
                .sortedArrayToBST(new int[] {-10, -3, 0, 5, 9})
                .toString());
    }

    @Test
    void sortedArrayToBST2() {
        assertEquals("[1, null, 3]",
            new Solution()
                .sortedArrayToBST(new int[] {1, 3})
                .toString());
    }

}