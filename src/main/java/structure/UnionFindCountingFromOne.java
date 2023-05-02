package structure;

// Alias disjoint-set
public class UnionFindCountingFromOne {
    private final int[] parent;
    private final int[] rank;
    private int connectedComponents;

    public UnionFindCountingFromOne(int size) {
        parent = new int[size + 1];
        rank = new int[size + 1];
        connectedComponents = size;

        for (int i = 1; i <= size; i++) {
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
