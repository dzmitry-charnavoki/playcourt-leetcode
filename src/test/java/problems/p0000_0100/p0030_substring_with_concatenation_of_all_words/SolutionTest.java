package problems.p0000_0100.p0030_substring_with_concatenation_of_all_words;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findSubstring1() {
        assertEquals(
            List.of(0, 9), new Solution()
                .findSubstring("barfoothefoobarman",
                    new String[] {"foo", "bar"}));
    }

    @Test
    void findSubstring2() {
        assertEquals(
            List.of(), new Solution()
                .findSubstring("wordgoodgoodgoodbestword",
                    new String[] {"word", "good", "best", "word"}));
    }

    @Test
    void findSubstring3() {
        assertEquals(
            List.of(6, 9, 12), new Solution()
                .findSubstring("barfoofoobarthefoobarman",
                    new String[] {"bar", "foo", "the"}));
    }

    @Test
    void findSubstring4() {
        assertEquals(
            List.of(8), new Solution()
                .findSubstring("wordgoodgoodgoodbestword",
                    new String[] {"best", "good", "good"}));
    }

    @Test
    void findSubstring5() {
        assertEquals(
            List.of(), new Solution()
                .findSubstring("wor",
                    new String[] {"word", "good", "best", "word"}));
    }

    @Test
    void findSubstring6() {
        assertEquals(
            List.of(8), new Solution()
                .findSubstring("wordgoodgoodgoodwtdnabestword",
                    new String[] {"good", "good", "wtdn"}));
    }

    @Test
    void findSubstring7() {
        assertEquals(
            List.of(8), new Solution()
                .findSubstring("wordgoodgoodgoodbestword",
                    new String[] {"word","good","best","good"}));
    }

    @Test
    void findSubstring_n1() {
        assertEquals(
            List.of(), new Solution()
                .findSubstring(null, null));
    }

    @Test
    void findSubstring_n2() {
        assertEquals(
            List.of(), new Solution()
                .findSubstring("", new String[] {"good", "good", "wtdn"}));
    }

    @Test
    void findSubstring_n3() {
        assertEquals(
            List.of(), new Solution()
                .findSubstring("goodwtdn", null));
    }

    @Test
    void findSubstring_n4() {
        assertEquals(
            List.of(), new Solution()
                .findSubstring("goodwtdn", new String[] {}));
    }
}