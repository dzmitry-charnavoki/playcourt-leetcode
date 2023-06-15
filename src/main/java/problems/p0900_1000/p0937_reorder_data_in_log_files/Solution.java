package problems.p0900_1000.p0937_reorder_data_in_log_files;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        String[] res = new String[logs.length];
        List<String> letWords = new ArrayList<>();
        List<String> digWords = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.charAt(log.indexOf(" ") + 1))) {
                digWords.add(log);
            } else {
                letWords.add(log);
            }
        }

        letWords.sort(comparator);

        int index = 0;
        for (String word : letWords) {
            res[index++] = word;
        }
        for (String word : digWords) {
            res[index++] = word;
        }

        return res;
    }

    private Comparator<String> comparator = (o1, o2) -> {
        String s1 = normalizer(o1);
        String s2 = normalizer(o2);
        int r = s1.compareTo(s2);
        if (r == 0) {
            return o1.compareTo(o2);
        }
        return r;
    };

    private String normalizer(String log) {
        return log.substring(log.indexOf(" ") + 1);
    }

}
