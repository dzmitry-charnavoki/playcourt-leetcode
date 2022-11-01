package com.d4.lc.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    public void secondLarget() {

        assertEquals(2, secondHighest("dfa12321afd"));
        assertEquals(-1, secondHighest("abc1111"));
        assertEquals(0, secondHighest("ck077"));
        assertEquals(4, secondHighest("sjhtz8344"));
    }

    /**
     * <a href="https://www.javatpoint.com/java-char-to-int">java-char-to-int</a>
     * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/description/">string\second-largest-digit-in-a-string</a>
     * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/submissions/834909290/">submission</a>
     * @param s string with digits
     * @return int value as second-largest-digit-in-a-string
     */
    public int secondHighest(String s) {
        int largest=-1;
        int secondLargest=-1;

        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) continue;
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
}
