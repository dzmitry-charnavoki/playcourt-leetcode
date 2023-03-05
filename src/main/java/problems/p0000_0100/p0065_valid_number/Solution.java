package problems.p0000_0100.p0065_valid_number;

class Solution {
    public boolean isNumber(String s) {
        boolean seenExp = false;
        boolean seenDot = false;
        boolean seenNum = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '.':
                    if (seenDot || seenExp) {
                        return false;
                    }
                    seenDot = true;
                    break;
                case 'e':
                case 'E':
                    if (seenExp || !seenNum) {
                        return false;
                    }
                    seenNum = false;
                    seenExp = true;
                    break;
                case '+':
                case '-':
                    if (i > 0 && s.charAt(i - 1) != 'e' ) {
                        return false;
                    }
                    break;
                default:
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                    seenNum = true;
            }
        }
        return seenNum;
    }
}
