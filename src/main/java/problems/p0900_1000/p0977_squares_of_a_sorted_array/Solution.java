package problems.p0900_1000.p0977_squares_of_a_sorted_array;

import java.util.Arrays;

class Solution {

    // 1 <= nums.length <= 104
    // -10^4 <= nums[i] <= 10^4
    // nums is sorted in non-decreasing order.
    // -7,-3,2,3,11

    public int[] sortedSquares(int[] nums) {
        int[] r = new int[nums.length];
        int cl = 0;
        int cr = nums.length - 1;
        int i = cr;
        while (cl <= cr) {
            if (Math.abs(nums[cl]) > Math.abs(nums[cr])) {
                r[i--] = nums[cl] * nums[cl++];
            } else {
                r[i--] = nums[cr] * nums[cr--];
            }
        }
        return r;
    }

    public int[] sortedSquares1(int[] nums) {
        int[] r = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            r[i] = nums[i] * nums[i];
        }
        Arrays.sort(r);
        return r;
    }
}
