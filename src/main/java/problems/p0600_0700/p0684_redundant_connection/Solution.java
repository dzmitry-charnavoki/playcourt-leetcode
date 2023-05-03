package problems.p0600_0700.p0684_redundant_connection;

import structure.UnionFindCountingFromOne;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFindCountingFromOne uf = new UnionFindCountingFromOne(edges.length);
        int[] ans = new int[] {};
        for (int[] edge : edges) {
            if (!uf.union(edge[0], edge[1])) {
                ans = edge;
            }
        }
        return ans;
    }
}
