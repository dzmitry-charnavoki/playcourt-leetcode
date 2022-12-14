package problems.p0300_0400.p0338_counting_bits;

class Solution {

    /** Comments for me.
     *             if ((i & 1) == 0) { // if even number, right bit is 0
     * //                r[i] = r[i / 2];
     *                 r[i] = r[i >> 1];
     *             } else {
     * //                r[i] = r[i - 1] + 1;
     *                 r[i] = r[i >> 1] + 1;
     *             }
     *             (i & 1) move it to calculation part and remove if
     */
    public int[] countBits(int n) {
        int[] r = new int[n + 1];
        for (int i = 1; i < r.length; i++) {
            r[i] = r[i >> 1] + (i & 1);
        }
        return r;
    }

}
