package problems.p0000_0100.p0068_text_justification;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void fullJustify1() {
        List<String> exp = List.of(
            "This    is    an",
            "example  of text",
            "justification.  ");
        String[] words =
            new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        assertIterableEquals(exp, new Solution().fullJustify(words, 16));
    }

    @Test
    void fullJustify2() {
        List<String> exp = List.of(
            "What   must   be",
            "acknowledgment  ",
            "shall be        ");
        String[] words =
            new String[] {"What", "must", "be", "acknowledgment", "shall", "be"};
        assertIterableEquals(exp, new Solution().fullJustify(words, 16));
    }

    @Test
    void fullJustify3() {
        List<String> exp = List.of(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        );
        String[] words =
            new String[] {"Science", "is", "what", "we", "understand", "well", "enough", "to",
                "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        assertIterableEquals(exp, new Solution().fullJustify(words, 20));
    }


}