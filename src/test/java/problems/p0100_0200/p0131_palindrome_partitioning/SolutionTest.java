package problems.p0100_0200.p0131_palindrome_partitioning;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void partition1() {
        List<List<String>> actual = new Solution().partition("aab");
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {"a", "a", "b"}, {"aa", "b"}
        });
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void partition2() {
        List<List<String>> actual = new Solution().partition("a");
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {"a"}
        });
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}