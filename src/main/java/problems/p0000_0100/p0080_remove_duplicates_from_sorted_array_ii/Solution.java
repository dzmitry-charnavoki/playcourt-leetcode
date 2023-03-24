package problems.p0000_0100.p0080_remove_duplicates_from_sorted_array_ii;

class Solution {

    public int removeDuplicates(int[] nums) {
        int l = 0;
        final int diff = 2;
        for (final int num : nums) {
            if (l < diff || num > nums[l - diff]) {
                nums[l++] = num;
            }
        }
        return l;
    }
}
