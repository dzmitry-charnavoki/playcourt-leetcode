package problems.p1500_1600.p1579_remove_max_number_of_edges_to_keep_graph_fully_traversable;

import java.util.Arrays;
import java.util.Comparator;
import structure.UnionFindCountingFromOne;

class Solution {
    private static final int BOTH = 3;
    private static final int ALICE = 1;
    private static final int BOB = 2;

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        // edges: 1 - n, numeration from 1
        UnionFindCountingFromOne ufAlice = new UnionFindCountingFromOne(n);
        UnionFindCountingFromOne ufBob = new UnionFindCountingFromOne(n);
        int added = 0;

        // Отсортировать ребра так, чтобы ребра типа 3 шли первыми
        Arrays.sort(edges, Comparator.comparingInt(a -> -a[0]));

        // Обработать каждое ребро
        for (int[] edge : edges) {
            final int type = edge[0];
            final int u = edge[1];
            final int v = edge[2];
            if (type == BOTH) {
                boolean aliceAdded = ufAlice.union(u, v);
                ufBob.union(u, v);
                if (aliceAdded) { //bobAdded - is not need since graphs same for both
                    added++;
                }
            } else if (type == ALICE && ufAlice.union(u, v)) {
                added++;
            } else if (type == BOB && ufBob.union(u, v)) {
                added++;
            }
        }
        if (ufAlice.isConnected() && ufBob.isConnected()) {
            return edges.length - added;
        } else {
            return -1;
        }
    }

}


