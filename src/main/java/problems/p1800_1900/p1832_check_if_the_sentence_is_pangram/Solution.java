package problems.p1800_1900.p1832_check_if_the_sentence_is_pangram;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean checkIfPangram(String sentence) {
        final int amountOfLetters = 26;
        Set<Character> seen = new HashSet<>();
        for (char cur : sentence.toCharArray()) {
            // no need to check if (cur >= 'a' && cur <= 'z') since there is the constraint
            seen.add(cur);
        }
        return seen.size() == amountOfLetters;
    }

    /** #official
     *  https://leetcode.com/problems/check-if-the-sentence-is-pangram/solutions/2616018/check-if-the-sentence-is-pangram/
     *  https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.19
     *
     */
    public boolean checkIfPangramBit(String sentence) {
        // Initialize seen = 0 since we start with no letter.
        int seen = 0;

        // Iterate over 'sentence'.
        for (char cur : sentence.toCharArray()) {
            // Map each 'currChar' to its index using its ASCII code.
            int mappedIndex = cur - 'a';

            // 'currBit' represents the bit for 'currChar'.
            int currBit = 1 << mappedIndex;

            // Use 'OR' operation since we only add its bit for once.
            seen |= currBit;
        }

        // Once we finish iterating, check if 'seen' contains 26 bits of 1.
        return seen == (1 << 26) - 1;
    }
}
