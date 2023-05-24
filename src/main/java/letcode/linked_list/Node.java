package letcode.linked_list;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
        this.val = 0;
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    @Override
    public String toString() {
        List<Node> nodes = new ArrayList<>();
        Node curr = this;
        while(curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }
        StringBuilder sb = new StringBuilder("[");
        for (Node node : nodes) {
            sb.append('[');
            sb.append(node.val);
            sb.append(',');
            if (node.random != null) {
                sb.append(nodes.indexOf(node.random));
            } else {
                sb.append("null");
            }
            sb.append("],");
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1); // remove trailing comma
        }
        sb.append(']');
        return sb.toString();
    }

}
