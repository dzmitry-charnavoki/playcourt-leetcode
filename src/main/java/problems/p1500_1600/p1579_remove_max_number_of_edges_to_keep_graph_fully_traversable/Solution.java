package problems.p1500_1600.p1579_remove_max_number_of_edges_to_keep_graph_fully_traversable;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    private static final int BOTH = 3;
    private static final int ALICE = 1;
    private static final int BOB = 2;

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind ufAlice = new UnionFind(n + 1); // edges: 1 - n, numeration from 1
        UnionFind ufBob = new UnionFind(n + 1);
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
                boolean bobAdded = ufBob.union(u, v);
                if (aliceAdded || bobAdded) {
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

    private static class UnionFind {
        private final int[] parent;
        private final int[] rank;
        private int connectedComponents;

        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            connectedComponents = size - 1;

            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) {
                return false;
            }

            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }

            connectedComponents--;
            return true;
        }

        public boolean isConnected() {
            return connectedComponents == 1;
        }
    }
}


