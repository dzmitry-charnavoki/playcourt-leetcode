package problems.p0100_0200.p0136_single_number;

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            ans ^= n;
        }
        return ans;
    }
}
