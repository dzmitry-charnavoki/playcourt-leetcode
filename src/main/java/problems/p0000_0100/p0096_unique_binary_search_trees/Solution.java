package problems.p0000_0100.p0096_unique_binary_search_trees;

class Solution {
    // https://www.geeksforgeeks.org/construct-all-possible-bsts-for-keys-1-to-n/
    // alt: Math - Catalan Number - ?
    public int numTrees(int n) {
        if (n < 2) {
            return 1;
        }
        int[] uniqueTrees = new int[n + 1];
        uniqueTrees[0] = 1;
        uniqueTrees[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                uniqueTrees[i] += uniqueTrees[j - 1] * uniqueTrees[i - j];
            }
        }
        return uniqueTrees[n];
    }
}
