package problems.p1800_1900.p1822_sign_of_the_product_of_an_array;

class Solution {
    public int arraySign(int[] nums) {
        boolean sign = true;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                sign = !sign;
            }
        }
        if (sign) {
            return 1;
        } else {
            return -1;
        }
    }
}
