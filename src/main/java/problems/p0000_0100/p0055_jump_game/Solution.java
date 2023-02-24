package problems.p0000_0100.p0055_jump_game;

class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int reach = 0;

        while (i < nums.length
            && i <= reach) {
            reach = Math.max(reach, i + nums[i]);
            if (reach >= nums.length) {
                return true;
            }
            i++;
        }

        return i == nums.length;
    }
}
