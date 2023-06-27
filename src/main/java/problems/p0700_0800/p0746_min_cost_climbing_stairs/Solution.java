package problems.p0700_0800.p0746_min_cost_climbing_stairs;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        final int n = cost.length;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 2], cost[i - 1]);
        }
        return Math.min(cost[n - 2], cost[n - 1]);
    }

}
