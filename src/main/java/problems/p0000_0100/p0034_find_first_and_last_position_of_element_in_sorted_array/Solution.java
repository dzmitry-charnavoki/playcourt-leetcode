package problems.p0000_0100.p0034_find_first_and_last_position_of_element_in_sorted_array;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[] {-1, -1};
        ans[0] = binSearchAdopted(nums, target, false);
        ans[1] = binSearchAdopted(nums, target, true);
        return ans;
    }

    // https://neerc.ifmo.ru/wiki/index.php?title=%D0%A6%D0%B5%D0%BB%D0%BE%D1%87%D0%B8%D1%81%D0%BB%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9_%D0%B4%D0%B2%D0%BE%D0%B8%D1%87%D0%BD%D1%8B%D0%B9_%D0%BF%D0%BE%D0%B8%D1%81%D0%BA
    private int binSearchAdopted(int[] nums, int key, boolean takeToTheRight) {
        int l = 0;
        int r = nums.length - 1;
        int m;
        int res = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] < key || (nums[m] == key) && takeToTheRight) {
                l = m + 1;
            } else {
                r = m - 1;
            }
            if (nums[m] == key) {
                res = m;
            }
        }
        return res;
    }

}
