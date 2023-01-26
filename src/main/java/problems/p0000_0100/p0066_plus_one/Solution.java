package problems.p0000_0100.p0066_plus_one;

class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length;
        int carry = 1; // instead of plus one
        int tmp = 0;
        while (--i >= 0) {
            tmp = digits[i] + carry;
            digits[i] = tmp % 10;
            carry = tmp / 10;
        }
        if (carry > 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = carry;
            System.arraycopy(digits, 0, ans, 1, ans.length - 1);
            return ans;
        }
        return digits;
    }
}
