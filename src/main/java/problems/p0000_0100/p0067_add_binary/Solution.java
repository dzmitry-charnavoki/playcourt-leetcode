package problems.p0000_0100.p0067_add_binary;

class Solution {
    public String addBinary(String a, String b) {
        int ac = a.length() - 1; // cursors
        int bc = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (ac >= 0
            || bc >= 0
            || carry == 1) {
            if (ac >= 0) {
                carry += a.charAt(ac--) - '0';
            }
            if (bc >= 0) {
                carry += b.charAt(bc--) - '0';
            }
            sb.append(carry % 2);
            carry = carry / 2;
        }
        return sb.reverse().toString();
    }
}
