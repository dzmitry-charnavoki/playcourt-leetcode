package problems.p0000_0100.p0027_remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int il = 0;
        int ir = 0;
        while (ir < nums.length) {
            if (val == nums[ir]) {
                ir++;
                continue;
            }
            if (il != ir) {
                nums[il] = nums[ir];
            }
            il++;
            ir++;
        }
        return il;
    }
}
