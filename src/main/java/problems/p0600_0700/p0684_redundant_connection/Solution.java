package problems.p0600_0700.p0684_redundant_connection;

import structure.UnionFindCountingFromOne;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFindCountingFromOne uf = new UnionFindCountingFromOne(edges.length);
        for (int[] edge : edges) {
            if (!uf.union(edge[0], edge[1])) {
                return edge;
            }
        }
        return new int[] {};
    }
}
