package problems.p0100_0200.p0167_two_sum_ii_input_array_is_sorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[] {};
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[] {l + 1, r + 1};
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }

        return ans;
    }
}
