package letcode.linked_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

    @Test
    public void createNode1() {
        assertEquals(0, new Node().val);
    }

    @Test
    public void createNode2() {
        assertEquals(1, new Node(1).val);
    }

    @Test
    public void createNode3() {
        Node n = new Node(1);
        Node r = new Node(2);
        Node act = new Node(0, n, r);
        assertEquals(0, act.val);
        assertEquals(n, act.next);
        assertEquals(r, act.random);
    }

    @Test
    public void toStringNode1() {
        assertEquals("[[0,null]]", new Node().toString());
    }

    @Test
    public void toStringNode2() {
        Node n = new Node(1);
        Node r = n;
        Node act = new Node(0, n, r);
        assertEquals("[[0,1],[1,null]]", act.toString());
    }
}