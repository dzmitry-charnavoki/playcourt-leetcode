package problems.p0000_0100.p0089_gray_code;

import java.util.AbstractList;
import java.util.List;

class Solution {
    // Frank Gray & 1953 &  gray code
    // https://en.wikipedia.org/wiki/Gray_code
    // https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%B4_%D0%93%D1%80%D0%B5%D1%8F
    public List<Integer> grayCode(int n) {

        return new AbstractList<>() {

            final int bits = n;

            @Override
            public Integer get(int index) {
                return index ^ (index >> 1);
            }

            @Override
            public int size() {
                return 1 << bits;
            }
        };
    }
}
