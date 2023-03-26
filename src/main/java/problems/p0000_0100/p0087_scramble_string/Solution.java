package problems.p0000_0100.p0087_scramble_string;

class Solution {

    public boolean isScramble(String s1, String s2) {
        int len = s1.length();

        boolean[][][] func = new boolean[len][len][len + 1];
        for (int k = 1; k <= len; ++k) {
            for (int i = 0; i + k <= len; ++i) {
                for (int j = 0; j + k <= len; ++j) {
                    if (k == 1) {
                        func[i][j][k] = s1.charAt(i) == s2.charAt(j);
                    } else {
                        for (int q = 1; q < k && !func[i][j][k]; ++q) {
                            func[i][j][k] = func[i][j][q] && func[i + q][j + q][k - q]
                                || func[i][j + k - q][q] && func[i + q][j][k - q];
                        }
                    }
                }
            }
        }
        return func[0][0][len];
    }
}
