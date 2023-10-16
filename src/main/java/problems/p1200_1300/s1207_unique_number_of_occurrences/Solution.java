package problems.p1200_1300.s1207_unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : arr) {
            m.computeIfPresent(n, (k, v) -> v + 1);
            m.putIfAbsent(n, 1);
        }
        Set<Integer> counts = new HashSet<>(m.values());
        return counts.size() == m.values().size();
    }

}
