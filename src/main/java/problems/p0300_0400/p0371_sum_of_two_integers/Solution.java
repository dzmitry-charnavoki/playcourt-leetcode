package problems.p0300_0400.p0371_sum_of_two_integers;

class Solution {
    //   a 0b00001011
    //   b 0b00001001
    //   s 0b00010100

    //    a 0b00001011
    //    b 0b00001001
    //  a&b 0b00001001
    //  a^b 0b00000010
    //carry 0b00001001
    //    b 0b00010010 << 1
    //repeat
    public int getSum(int a, int b) {
        int carry = 0;
        do {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        } while (b != 0);
        return a;
    }

}
