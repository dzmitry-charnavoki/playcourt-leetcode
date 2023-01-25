package problems.p0000_0100.p0038_count_and_say;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void countAndSay1() {
        assertEquals("1", new Solution().countAndSay(1));
    }

    @Test
    void countAndSay2() {
        assertEquals("1211", new Solution().countAndSay(4));
    }

    @Test
    void countAndSay3() {
        assertEquals("111221", new Solution().countAndSay(5));
    }

    @Test
    void countAndSay4() {
        assertEquals("312211", new Solution().countAndSay(6));
    }
    @Test
    void countAndSay5() {
        assertEquals("13112221", new Solution().countAndSay(7));
    }
}