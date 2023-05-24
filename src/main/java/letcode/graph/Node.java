package letcode.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Node {
    public int val;
    public List<Node> neighbors = new ArrayList<>();

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(",", "[", "]");
        for (Node node : neighbors) {
            StringJoiner result2 = new StringJoiner(",", "[", "]");
            for (Node nodeItem : node.neighbors) {
                result2.add(String.valueOf(nodeItem.val));
            }
            result.add(result2.toString());
        }
        return result.toString();
    }
}
