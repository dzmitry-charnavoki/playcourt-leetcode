package structure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UnionFindTest {

    @Test
    public void testConnectedComponents() {
        UnionFindCountingFromOne uf = new UnionFindCountingFromOne(5);
        assertFalse(uf.isConnected());

        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(3, 4);

        assertTrue(uf.isConnected());
    }

    @Test
    public void testUnion() {
        UnionFindCountingFromOne uf = new UnionFindCountingFromOne(5);
        assertFalse(uf.isConnected());

        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(3, 4);

        assertEquals(1, uf.find(1));
        assertEquals(1, uf.find(2));
        assertEquals(3, uf.find(4));
    }

    @Test
    public void testUnionAlreadyConnected() {
        UnionFindCountingFromOne uf = new UnionFindCountingFromOne(5);
        assertFalse(uf.isConnected());

        uf.union(0, 1);
        uf.union(1, 2);
        assertFalse(uf.union(0, 2));
        assertFalse(uf.isConnected());
    }

    @Test
    public void testUnionWithHigherRankRoot() {
        UnionFindCountingFromOne uf = new UnionFindCountingFromOne(5);
        assertFalse(uf.isConnected());

        uf.union(1, 2);
        uf.union(4, 5);

        assertTrue(uf.union(2, 5));
        assertTrue(uf.union(3, 4));
        assertTrue(uf.isConnected());
    }



}