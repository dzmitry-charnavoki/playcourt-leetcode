package problems.p0100_0200.p0127_word_ladder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void ladderLength() {
        assertEquals(5, new Solution().ladderLength("hit", "cog",
            List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void ladderLength1() {
        assertEquals(0, new Solution().ladderLength("hit", "cog",
            List.of("hot", "dot", "dog", "lot", "log")));
    }

    @Test
    void ladderLength2() {
        assertEquals(0, new Solution().ladderLength("hot", "dog",
            List.of("hot", "dog")));
    }

    @Test
    void ladderLength3() {
        assertEquals(2, new Solution().ladderLength("hot", "dot",
            List.of("hot", "dot", "dog")));
    }
}