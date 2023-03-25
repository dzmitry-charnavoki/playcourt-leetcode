package problems.p0000_0100.p0033_search_in_rotated_sorted_array;

class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            mid = (l + r) >> 1;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[l] <= nums[mid]) { // nums[l..m] are sorted
                if (nums[l] <= target && target <= nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else { // nums[m..n - 1] are sorted
                if (target <= nums[r] && nums[mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
