package problems.p0000_0100.p0017_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

class Solution {

    // https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%B8%D1%81%D0%BA_%D1%81_%D0%B2%D0%BE%D0%B7%D0%B2%D1%80%D0%B0%D1%82%D0%BE%D0%BC
    // https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%B8%D1%81%D0%BA_%D0%B2_%D0%B3%D0%BB%D1%83%D0%B1%D0%B8%D0%BD%D1%83#:~:text=Depth%2Dfirst%20search%2C%20DFS),%D0%B8%D1%81%D1%85%D0%BE%D0%B4%D1%8F%D1%89%D0%B8%D0%B5%20%D0%B8%D0%B7%20%D1%80%D0%B0%D1%81%D1%81%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D0%B2%D0%B0%D0%B5%D0%BC%D0%BE%D0%B9%20%D0%B2%D0%B5%D1%80%D1%88%D0%B8%D0%BD%D1%8B%20%D1%80%D1%91%D0%B1%D1%80%D0%B0.
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        String[] hs =
            new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        findCombinations(digits, 0, new StringBuilder(), combinations, hs);
        return combinations;
    }

    public static void findCombinations(String digits, int index, StringBuilder ref,
                                        List<String> combinations, String[] hs) {
        if (digits.length() == index) {
            combinations.add(ref.toString());
            return;
        }
        String letters = hs[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            ref.append(c);
            findCombinations(digits, index + 1, ref, combinations, hs);
            ref.deleteCharAt(ref.length() - 1); //Delete Last - backtracking
        }

    }

}
