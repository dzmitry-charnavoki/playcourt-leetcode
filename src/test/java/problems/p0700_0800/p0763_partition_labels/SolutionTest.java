package problems.p0700_0800.p0763_partition_labels;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void partitionLabels1() {
        List<Integer> act = new Solution().partitionLabels("ababcbacadefegdehijhklij");
        assertEquals(List.of(9, 7, 8), act);
    }

    @Test
    void partitionLabels2() {
        List<Integer> act = new Solution().partitionLabels("eccbbbbdec");
        assertEquals(List.of(10), act);
    }
}