package problems.p0000_0100.p0049_group_anagrams;

import java.util.Comparator;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void groupAnagrams1() {
        List<List<String>> actual =
            new Solution().groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {"bat"},
            {"tan", "nat"},
            {"eat", "tea", "ate"}
        });
        actual.sort(Comparator.comparingInt(List::size));

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void groupAnagrams2() {
        List<List<String>> actual =
            new Solution().groupAnagrams(new String[] {""});
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {""}
        });
        actual.sort(Comparator.comparingInt(List::size));

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
    @Test
    void groupAnagrams3() {
        List<List<String>> actual =
            new Solution().groupAnagrams(new String[] {"a"});
        List<List<String>> expected = ListUtils.getLists(new String[][] {
            {"a"}
        });
        actual.sort(Comparator.comparingInt(List::size));

        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}