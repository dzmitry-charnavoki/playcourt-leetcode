package problems.p0900_1000.p0937_reorder_data_in_log_files;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reorderLogFiles() {
        String[] act = new String[] {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig",
            "let3 art zero"};
        String[] exp =
            new String[] {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1",
                "dig2 3 6"};

        assertArrayEquals(exp, new Solution().reorderLogFiles(act));
    }

    @Test
    void reorderLogFiles1() {
        String[] act =
            new String[] {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        String[] exp =
            new String[] {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
        assertArrayEquals(exp, new Solution().reorderLogFiles(act));
    }

    @Test
    void reorderLogFiles2() {
        String[] act =
            new String[] {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a6 act zoo"};
        String[] exp =
            new String[] {"g1 act car", "a6 act zoo", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
        assertArrayEquals(exp, new Solution().reorderLogFiles(act));
    }
}