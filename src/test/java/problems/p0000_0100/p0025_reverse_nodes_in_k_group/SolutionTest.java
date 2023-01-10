package problems.p0000_0100.p0025_reverse_nodes_in_k_group;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void reverseKGroup_1() {
        assertEquals("2, 1, 4, 3, 5", new Solution()
            .reverseKGroup(ListNode
                .of(1, 2, 3, 4, 5), 2).toString());
    }

    @Test
    void reverseKGroup_2() {
        assertEquals("3, 2, 1, 4, 5", new Solution()
            .reverseKGroup(ListNode
                .of(1, 2, 3, 4, 5), 3).toString());
    }

    @Test
    void reverseKGroup_3() {
        assertEquals("3, 2, 1, 6, 5, 4, 7",
            new Solution()
                .reverseKGroup(ListNode
                    .of(1, 2, 3, 4, 5, 6, 7), 3).toString());
    }

}