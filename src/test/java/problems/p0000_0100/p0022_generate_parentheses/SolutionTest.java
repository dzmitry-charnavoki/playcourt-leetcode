package problems.p0000_0100.p0022_generate_parentheses;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void generateParenthesis_1() {
        assertLinesMatch(List.of("((()))", "(()())", "(())()", "()(())", "()()()"),
            new Solution().generateParenthesis(3));
    }

    @Test
    void generateParenthesis_2() {
        assertLinesMatch(List.of("()"),
            new Solution().generateParenthesis(1));
    }

}