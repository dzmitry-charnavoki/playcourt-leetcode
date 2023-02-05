package problems.p0000_0100.p0043_multiply_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void multiply1() {
        assertEquals("6", new Solution().multiply("2", "3"));
    }

    @Test
    void multiply2() {
        assertEquals("56088", new Solution().multiply("123", "456"));
    }

    @Test
    void multiply3() {
        assertEquals("12", new Solution().multiply("3", "4"));
    }

    @Test
    void multiply4() {
        assertEquals("1860496", new Solution().multiply("2728", "682"));
    }
   @Test
    void multiply5() {
        assertEquals("0", new Solution().multiply("0", "0"));
    }
}