package problems.p0100_0200.p0138_copy_list_with_random_pointer;

import java.util.HashMap;
import java.util.Map;
import letcode.linked_list.Node;

class Solution {
    private Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        if (map.containsKey(head)) {
            return map.get(head);
        }

        Node newNode = new Node(head.val);
        map.put(head, newNode);
        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);
        return newNode;
    }

}
