package problems.p0200_0300.p0268_missing_number;

class Solution {

    public int missingNumberBitM(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            m ^= nums[i] ^ (i + 1);
        }
        return m;
    }


}
