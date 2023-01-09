package utils;

import static java.util.Objects.nonNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Utility class.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("" + val);
        if (nonNull(next)) {
            ListNode current = next;
            Set<ListNode> hs = new HashSet<>();
            while (nonNull(current.next)) {
                if (!hs.add(current)) {
                    result.append(" tail ->");
                    break;
                }
                result.append(", ");
                result.append(current.val);
                current = current.next;
            }
            result.append(", ");
            result.append(current.val);
        }
        return result.toString();
    }

    /** Helper method to generate List of nodes from given numbers.
     *
     * @param nums array of int
     * @return ListNode obj
     */
    public static ListNode of(int... nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode tail = new ListNode(nums[0]);
        ListNode head = tail;
        for (int i = 1; i < nums.length; i++) {
            tail.next = new ListNode(nums[i]);
            tail = tail.next;
        }
        return head;
    }
}
