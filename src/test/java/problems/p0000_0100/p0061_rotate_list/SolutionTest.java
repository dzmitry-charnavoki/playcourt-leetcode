package problems.p0000_0100.p0061_rotate_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void rotateRight_n1() {
        assertNull(new Solution().rotateRight(null, 2));
    }

    @Test
    void rotateRight_n2() {
        ListNode n = ListNode.of(1, 2, 3, 4, 5);
        assertEquals(n.toString(), new Solution().rotateRight(n, 0).toString());
    }

    @Test
    void rotateRight1() {
        ListNode n = ListNode.of(1, 2, 3, 4, 5);
        assertEquals("4, 5, 1, 2, 3", new Solution().rotateRight(n, 2).toString());
    }

    @Test
    void rotateRight2() {
        ListNode n = ListNode.of(0, 1, 2);
        assertEquals("2, 0, 1", new Solution().rotateRight(n, 4).toString());
    }
}