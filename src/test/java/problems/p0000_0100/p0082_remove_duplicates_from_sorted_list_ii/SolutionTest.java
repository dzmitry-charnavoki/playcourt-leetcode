package problems.p0000_0100.p0082_remove_duplicates_from_sorted_list_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void deleteDuplicates1() {
        ListNode ln = ListNode.of(1, 2, 3, 3, 4, 4, 5);
        assertEquals("1, 2, 5", new Solution().deleteDuplicates(ln).toString());
    }

    @Test
    void deleteDuplicates2() {
        ListNode ln = ListNode.of(1, 1, 1, 2, 3);
        assertEquals("2, 3", new Solution().deleteDuplicates(ln).toString());
    }


}