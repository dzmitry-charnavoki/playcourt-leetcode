package problems.p0000_0100.p0075_sort_colors;

public class Solution {
    public void sortColors(int[] nums) {
        // Approach: 2 pointers + swapping
        int l = 0;
        int r = nums.length - 1;
        int cursor = 0;
        while (l < r && cursor <= r) {
            if (nums[cursor] == 0) {
                swap(nums, cursor++, l++);
            } else if (nums[cursor] == 1) {
                cursor++;
            } else { // no other case except nums[cursor] == 2 leaved - no sense to check
                swap(nums, cursor, r--);
            }
        }
    }

    private void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
