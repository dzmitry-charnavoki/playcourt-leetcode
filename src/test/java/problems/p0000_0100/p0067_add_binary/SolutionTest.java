package problems.p0000_0100.p0067_add_binary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void addBinary_1() {
        assertEquals("100", new Solution().addBinary("11", "1"));
    }

    @Test
    void addBinary_2() {
        assertEquals("10101", new Solution().addBinary("1010", "1011"));
    }
    @Test
    void addBinary_3() {
        assertEquals("110", new Solution().addBinary("11", "11"));
    }
    @Test
    void addBinary_4() {
        assertEquals("100", new Solution().addBinary("1", "11"));
    }

    @Test
    void addBinary_n1() {
        assertEquals("", new Solution().addBinary("", ""));
    }
}