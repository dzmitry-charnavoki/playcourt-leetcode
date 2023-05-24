package letcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import letcode.graph.Node;
import org.junit.jupiter.api.Test;

class NodeTest {

    @Test
    void testToString() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node1and2and4 = new Node(1, Arrays.asList(node2, node4));
        Node node2and1and3 = new Node(2, Arrays.asList(node1, node3));
        Node node3and2and4 = new Node(3, Arrays.asList(node2, node4));
        Node node4and1and3 = new Node(4, Arrays.asList(node1, node3));
        Node node =
            new Node(5, Arrays.asList(node1and2and4, node2and1and3, node3and2and4, node4and1and3));

        assertEquals("[[2,4],[1,3],[2,4],[1,3]]", node.toString());
        assertEquals("[]",new Node(1).toString());
    }

    @Test
    public void construct(){
        Node n = new Node();
        Node n1 = new Node(3);
        Node n2 = new Node(5, List.of(n, n1));
        assertEquals(0, n.val);
        assertEquals(3, n1.val);
        assertEquals(5, n2.val);
        assertEquals(0, n2.neighbors.get(0).val);
        assertEquals(3, n2.neighbors.get(1).val);
    }

}