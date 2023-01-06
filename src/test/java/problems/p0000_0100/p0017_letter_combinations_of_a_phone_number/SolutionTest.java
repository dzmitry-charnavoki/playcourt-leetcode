package problems.p0000_0100.p0017_letter_combinations_of_a_phone_number;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void letterCombinations1() {
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            new Solution().letterCombinations("23"));
    }

    @Test
    void letterCombinations_n1() {
        assertEquals(Collections.emptyList(), new Solution().letterCombinations(""));
    }

    @Test
    void letterCombinations_n2() {
        assertEquals(Collections.emptyList(), new Solution().letterCombinations(null));
    }

    @Test
    void letterCombinations3() {
        assertEquals(Arrays.asList("a", "b", "c"), new Solution().letterCombinations("2"));
    }
}