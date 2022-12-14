package problems.p1700_1800.p1796_second_largest_digit_in_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

   Solution test = new Solution();

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
