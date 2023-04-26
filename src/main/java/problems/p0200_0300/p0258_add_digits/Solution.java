package problems.p0200_0300.p0258_add_digits;

class Solution {
    // https://en.wikipedia.org/wiki/Digital_root
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        int t = 0;
        while (num > 0){
            t = num % 10;
            num = num / 10;
            sum+=t;
        }
        return addDigits(sum);
    }
}
