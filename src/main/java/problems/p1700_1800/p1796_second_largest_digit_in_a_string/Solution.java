package problems.p1700_1800.p1796_second_largest_digit_in_a_string;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * the second-largest digit in a string.
 *
 * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/description/">string\second-largest-digit-in-a-string</a>
 * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/submissions/834909290/">submission</a>
 */
class Solution {

    private static final int AT_LEAST_TWO_ITEMS = 2;

    /**
     * the second-largest digit in a string.
     * <a href="https://www.javatpoint.com/java-char-to-int">java-char-to-int</a>
     *
     * @param s string with digits
     * @return int value as second-largest-digit-in-a-string
     */
    public int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                continue;
            }
            int d = Character.getNumericValue(c);
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d < largest && d > secondLargest) {
                secondLargest = d;
            }
        }

        return secondLargest;
    }

    /**
     * the second-largest digit in a string.
     *
     * @param s string with digits
     * @return int value as second-largest-digit-in-a-string
     */
    public int secondHighest2(String s) {

        Set<Character> ds = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                continue;
            }
            ds.add(c);
        }

        if (ds.size() < AT_LEAST_TWO_ITEMS) {
            return -1;
        }

        //Character secondLargest = new ArrayList<>(ds).get(ds.size() -2 );
        Character secondLargest = ds.stream().skip(1).findFirst().get();
        return Character.getNumericValue(secondLargest);
    }
}
