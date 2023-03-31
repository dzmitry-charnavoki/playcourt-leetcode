package problems.p0000_0100.p0088_merge_sorted_array;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fp = m - 1;
        int sp = n - 1;
        int r = nums1.length - 1;
        while (sp >= 0) {
            if (fp >= 0 && nums1[fp] > nums2[sp]) {
                nums1[r--] = nums1[fp--];
            } else {
                nums1[r--] = nums2[sp--];
            }
        }
    }

}
