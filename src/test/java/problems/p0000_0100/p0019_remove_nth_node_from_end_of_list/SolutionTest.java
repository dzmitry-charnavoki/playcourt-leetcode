package problems.p0000_0100.p0019_remove_nth_node_from_end_of_list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import utils.DataGenerator;
import utils.ListNode;

class SolutionTest {

    @Test
    void removeNthFromEnd1() {
        ListNode n = DataGenerator.createObj(1, 2, 3, 4, 5);
        assertEquals("1, 2, 3, 5", new Solution().removeNthFromEnd(n, 2).toString());
    }

    @Test
    void removeNthFromEnd2() {
        ListNode n = DataGenerator.createObj(1);
        assertNull( new Solution().removeNthFromEnd(n, 1));
    }

    @Test
    void removeNthFromEnd3() {
        ListNode n = DataGenerator.createObj(1, 2);
        assertEquals("1", new Solution().removeNthFromEnd(n, 1).toString());
    }

}