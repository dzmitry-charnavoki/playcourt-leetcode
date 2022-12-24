package problems.p0000_0100.p0070_climbing_stairs;

class Solution {
    int[] memo = new int[46];

    public int climbStairs(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int r = climbStairs(n - 1) + climbStairs(n - 2);
        memo[n] = r;
        return r;
    }

    //  Bottom — Up Approach
    public int climbStairsBottomUp(int n) {
        int prev = 1;
        int temp = 0;
        int cur = 1;
        for (int i = 2; i <= n; i++) {
            temp = cur;
            cur = cur + prev;
            prev = temp;
        }
        return cur;
    }
}
