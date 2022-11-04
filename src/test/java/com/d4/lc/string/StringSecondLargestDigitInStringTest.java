package com.d4.lc.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringSecondLargestDigitInStringTest {

   StringSecondLargestDigitInString test = new StringSecondLargestDigitInString();

   @Test
   public void secondLargestTest() {
      assertEquals(2, test.secondHighest("dfa12321afd"));
      assertEquals(-1, test.secondHighest("abc1111"));
      assertEquals(0, test.secondHighest("ck077"));
      assertEquals(4, test.secondHighest("sjhtz8344"));
   }

   @Test
   public void secondLargestViaSetTest() {
      assertEquals(2, test.secondHighest2("dfa12321afd"));
      assertEquals(-1, test.secondHighest2("abc1111"));
      assertEquals(0, test.secondHighest2("ck077"));
      assertEquals(4, test.secondHighest2("sjhtz8344"));
   }

}
