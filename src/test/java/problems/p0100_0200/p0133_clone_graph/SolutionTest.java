package problems.p0100_0200.p0133_clone_graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import letcode.graph.Node;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void cloneGraph() {
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
        assertNotSame(node, new Solution().cloneGraph(node));
        assertEquals("[[2,4],[1,3],[2,4],[1,3]]", new Solution().cloneGraph(node).toString());

    }

    @Test
    void cloneGraph2() {
        Node node = new Node(1);
        assertNotSame(node, new Solution().cloneGraph(node));
        assertEquals("[]", new Solution().cloneGraph(node).toString());
    }

    @Test
    void cloneGraph3() {
        assertNull(new Solution().cloneGraph(null));
    }

}