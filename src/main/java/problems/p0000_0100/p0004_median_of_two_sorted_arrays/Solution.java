package problems.p0000_0100.p0004_median_of_two_sorted_arrays;

class Solution {

    // https://en.wikipedia.org/wiki/Quickselect
    // https://habr.com/ru/post/346930/
    // https://en.wikipedia.org/wiki/Median_of_medians
    // https://russianblogs.com/article/6686238268/

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO need to review
        int[] two = new int[2];

        int p1 = 0;
        int p2 = 0;
        int n = nums1.length + nums2.length;
        int i = 0;
        boolean isTwo = n % 2 == 0;
        int k = n % 2 == 0 ? n / 2 : n / 2 + 1;
        double med = 0;
        while (i <= k) {
            int cur = 0;
            if (p1 < nums1.length && p2 < nums2.length) {
                if (nums1[p1] > nums2[p2]) {
                    cur = nums2[p2];
                    p2++;
                } else {
                    cur = nums1[p1];
                    p1++;
                }
            } else if (p1 < nums1.length) {
                cur = nums1[p1];
                p1++;
            } else if (p2 < nums2.length) {
                cur = nums2[p2];
                p2++;
            }
            two[1] = two[0];
            two[0] = cur;
            i++;
        }

        if (isTwo) {
            med = (double) (two[0] + two[1]) / 2;
        } else {
            med = two[1];
        }

        return med;
    }
}
