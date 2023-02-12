package problems.p0000_0100.p0045_jump_game_ii;

class Solution {
    // https://en.wikipedia.org/wiki/Breadth-first_search
    public int jump(int[] nums) {
        // The starting range of the first jump is [0, 0]
        int answer = 0;
        int n = nums.length;
        int curEnd = 0;
        int curFar = 0;
        for (int i = 0; i < n - 1; ++i) {
            // Update the farthest reachable index of this jump.
            curFar = Math.max(curFar, i + nums[i]);
            // If we finish the starting range of this jump,
            // Move on to the starting range of the next jump.
            if (i == curEnd) {
                answer++;
                curEnd = curFar;
            }
        }
        return answer;
    }

    public int jump2(int[] nums) {

        int[] dp = new int[nums.length];

        for (int i = dp.length - 2; i >= 0; i--) {
            int jumps = 100000;
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < dp.length) {
                    jumps = Math.min(jumps, dp[i + j]);
                }
            }
            dp[i] = jumps + 1;
        }

        return dp[0];
    }
}
