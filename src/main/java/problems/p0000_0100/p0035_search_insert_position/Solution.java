package problems.p0000_0100.p0035_search_insert_position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else if (target < nums[m]){
                r = m - 1;
            }
        }

        return l;
    }
}
