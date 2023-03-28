package problems.p0000_0100.p0083_remove_duplicates_from_sorted_list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void deleteDuplicates1() {
        ListNode ln = ListNode.of(1, 1, 2);
        assertEquals("1, 2", new Solution().deleteDuplicates(ln).toString());
    }

    @Test
    void deleteDuplicates2() {
        ListNode ln = ListNode.of(1, 1, 2, 3, 3);
        assertEquals("1, 2, 3", new Solution().deleteDuplicates(ln).toString());
    }

    @Test
    void deleteDuplicates3() {
        assertNull(new Solution().deleteDuplicates(null));
    }
}