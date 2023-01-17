package problems.p0000_0100.p0030_substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> indexes = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return indexes;
        }

        int lengthOfOneWord = words[0].length();
        int lengthOfWindow = words.length * lengthOfOneWord;

        Map<String, Integer> dict = new HashMap<>();
        for (String word : words) {
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < lengthOfOneWord; i++) {
            for (int j = i; j + lengthOfWindow <= s.length(); j = j + lengthOfOneWord) {
                String window = s.substring(j, j + lengthOfWindow);
                Map<String, Integer> map = new HashMap<>();
                for (int m = words.length - 1; m >= 0; m--) {
                    String word = window.substring(m * lengthOfOneWord, (m + 1) * lengthOfOneWord);
                    int count = map.getOrDefault(word, 0) + 1;
                    if (count > dict.getOrDefault(word, 0)) {
                        j = j + m * lengthOfOneWord;
                        break;
                    } else if (m == 0) {
                        indexes.add(j);
                    } else {
                        map.put(word, count);
                    }
                }
            }
        }
        return indexes;
    }

}
