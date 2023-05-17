package problems.p0100_0200.p0150_evaluate_reverse_polish_notation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void evalRPN1() {
        assertEquals(9, new Solution().evalRPN(new String[] {"2", "1", "+", "3", "*"}));
    }

    @Test
    void evalRPN2() {
        assertEquals(6, new Solution().evalRPN(new String[] {"4", "13", "5", "/", "+"}));
    }

    @Test
    void evalRPN3() {
        assertEquals(22, new Solution().evalRPN(
            new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    void evalRPN4() {
        assertEquals(2, new Solution().evalRPN(new String[] {"4", "13", "5", "/", "-"}));
    }
}