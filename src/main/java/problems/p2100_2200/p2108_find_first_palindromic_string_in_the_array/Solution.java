package problems.p2100_2200.p2108_find_first_palindromic_string_in_the_array;

class Solution {

    private static boolean isPalindrome(String word) {
        int m = word.length() / 2;
        for (int i = 0; i <= m; i++) {
            int ec = word.length() - i - 1;
            if (word.charAt(i) != word.charAt(ec)) {
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
}
