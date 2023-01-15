package problems.p0000_0100.p0029_divide_two_integers;

class Solution {
    /**
     * Idea:
     * The main idea to solve this problem is to use Bit Manipulation.
     * First, we need to write corner cases, since we’re dealing in an environment
     *      where we have numbers in the 32-bit range.
     * Corner Cases are:
     * If the dividend is INT_MIN, and the divisor is 1, the answer is INT_MIN.
     * If the dividend is INT_MIN, and the divisor is -1, the answer is INT_MAX.
     * If the divisor is INT_MIN, return 0.
     * The key observation is that the quotient of a division is just the number of times
     *      that we can subtract the divisor from the dividend without making it negative.
     * Note that when a dividend is INT_MIN:
     * If the divisor is odd, increase the dividend by 1.
     * If the divisor is even, divide both dividend and divisor by 2.
     * Doing the above operations won’t change the quotient.
     *
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int res = 0;
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        while (dvs <= dvd) {
            long temp = dvs;
            long mul = 1;
            while (dvd >= temp << 1) {
                temp <<= 1;
                mul <<= 1;
            }
            dvd -= temp;
            res += mul;
        }
        return sign == 1 ? res : -res;
    }
}
