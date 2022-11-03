package com.d4.lc.string;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/description/">string\second-largest-digit-in-a-string</a>
 * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/submissions/834909290/">submission</a>
 */
public class StringSecondLargestDigitInStringTest {

    @Test
    public void secondLarget() {
        assertEquals(2, secondHighest("dfa12321afd"));
        assertEquals(-1, secondHighest("abc1111"));
        assertEquals(0, secondHighest("ck077"));
        assertEquals(4, secondHighest("sjhtz8344"));
    }

    /**
     * <a href="https://www.javatpoint.com/java-char-to-int">java-char-to-int</a>
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

    @Test
    public void secondLargestViaSet() {
        assertEquals(2, secondHighest2("dfa12321afd"));
        assertEquals(-1, secondHighest2("abc1111"));
        assertEquals(0, secondHighest2("ck077"));
        assertEquals(4, secondHighest2("sjhtz8344"));
    }
    public int secondHighest2(String s) {

        Set<Character> ds = new TreeSet<>(Collections.reverseOrder());

        for (int i=0;i<s.length();++i) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) continue;
            ds.add(c);
        }

        if(ds.size() < 2){
            return -1;
        }

//        Character secondLargest = new ArrayList<>(ds).get(ds.size() -2 );
        Character secondLargest = ds.stream().skip(1).findFirst().get();
        return Character.getNumericValue(secondLargest);
    }
}
