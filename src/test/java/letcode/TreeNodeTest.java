package letcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void of() {
        TreeNode tn = TreeNode.of(1, null, 2, 3);
        assertEquals(1, tn.val);
        assertNull(tn.left);
        assertEquals(2, tn.right.val);
        assertEquals(3, tn.right.left.val);
        assertNull(tn.right.right);
    }

    @Test
    void of_n() {
        assertNull(TreeNode.of((Integer[]) null));
        assertNull(TreeNode.of(null,1));
        assertNull(TreeNode.of());
    }

    @Test
    void testToString() {
        assertEquals("1, 2, 3, 4, 5", TreeNode.of(1, 2, 3, 4, 5).toString());
        assertEquals("1, null, 2, 3, null", TreeNode.of(1, null, 2, 3).toString());
        assertEquals("1, 2, null, 3, null", TreeNode.of(1, 2, null, 3).toString());
    }

    @Test
    void testConstruct() {
        TreeNode tn = new TreeNode();
        TreeNode tnl = new TreeNode(1);
        TreeNode tnr = new TreeNode(2);
        TreeNode r = new TreeNode(3, tnl, tnr);
        assertEquals(0, tn.val);
        assertEquals(1, tnl.val);
        assertEquals(2, tnr.val);
        assertEquals(3, r.val);
        assertEquals(tnl, r.left);
        assertEquals(tnr, r.right);
    }
}