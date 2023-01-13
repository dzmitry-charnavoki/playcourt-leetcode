package problems.p0000_0100.p0026_remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int il = 0;
        int ir = 0;
        while (++ir < nums.length) {
            if (nums[il] != nums[ir]) {
                nums[++il] = nums[ir];
            }
        }
        return il + 1;
    }
}
