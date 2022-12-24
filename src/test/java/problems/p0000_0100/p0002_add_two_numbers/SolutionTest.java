package problems.p0000_0100.p0002_add_two_numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.DataGenerator;
import utils.ListNode;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertEquals("7, 0, 8", new Solution().addTwoNumbers(listNode1, listNode2).toString());
    }

    @Test
    void addTwoNumbers2() {
        assertEquals("0",
            new Solution().addTwoNumbers(new ListNode(0), new ListNode(0)).toString());
    }

    @Test
    void addTwoNumbers3() {
        ListNode listNode1 = DataGenerator.createObj(9, 9, 9, 9, 9, 9, 9);
        ListNode listNode2 = DataGenerator.createObj(9, 9, 9, 9);
        assertEquals("8, 9, 9, 9, 0, 0, 0, 1",
            new Solution().addTwoNumbers(listNode1, listNode2).toString());
    }

    @Test
    void addTwoNumbers4() {
        assertEquals("0",
            new Solution().addTwoNumbers(null, new ListNode(0)).toString());
    }

    @Test
    void addTwoNumbers5() {
        assertEquals("0",
            new Solution().addTwoNumbers(new ListNode(0), null).toString());
    }
}