package utils;

import static java.util.Objects.nonNull;

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
            while (nonNull(current.next)) {
                result.append(", ");
                result.append(current.val);
                current = current.next;
            }
            result.append(", ");
            result.append(current.val);
        }
        return result.toString();
    }
}
