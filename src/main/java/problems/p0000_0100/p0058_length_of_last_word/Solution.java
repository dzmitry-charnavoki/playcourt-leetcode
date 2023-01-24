package problems.p0000_0100.p0058_length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();
    }
}
