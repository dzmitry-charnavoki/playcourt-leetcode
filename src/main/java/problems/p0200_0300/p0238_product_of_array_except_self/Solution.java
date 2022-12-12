package problems.p0200_0300.p0238_product_of_array_except_self;

class Solution {

    //  [01, 02, 03, 04]
    //      [24, 12, 04, 01] < 1

    public int[] productExceptSelfSuffixAsArray(int[] nums) {
        int[] r = new int[nums.length];
        r[nums.length - 1] = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            r[i - 1] = r[i] * nums[i];
        }

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            r[i] *= prefix;
            prefix *= nums[i];
        }

        return r;
    }

    //          [01, 02, 03, 04]
    // 1 >  [01, 01, 02, 06]
    public int[] productExceptSelfPrefixAsArray(int[] nums) {
        int[] r = new int[nums.length];
        r[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            r[i] = r[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            r[i] *= suffix;
            suffix *= nums[i];
        }

        return r;
    }
}
