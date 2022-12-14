package problems.p0100_0200.p0152_maximum_product_subarray;

class Solution {

    // https://afteracademy.com/blog/max-product-subarray/
    // https://www.scaler.com/topics/maximum-product-subarray/
    // https://www.interviewbit.com/blog/maximum-product-subarray-problem/
    // -2, -3, 0, -2, -40
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int r = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // to avoid overriding
            int tmpMax = Math.max(num, Math.max(num * max, num * min));
            min = Math.min(num, Math.min(num * max, num * min));
            max = tmpMax;
            r = Math.max(r, max);
        }
        return r;
    }
}
