package problems.p0100_0200.p0125_valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        int l = -1;
        int r = s.length();

        while (++l < --r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                ++l;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                --r;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
        }

        return true;
    }
}
