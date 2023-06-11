package problems.p0600_0700.p0621_task_scheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void test1() {
        assertEquals(8, new Solution()
            .leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    public void test2() {
        assertEquals(6, new Solution()
            .leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }

    @Test
    public void test3() {
        assertEquals(16, new Solution()
            .leastInterval(new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                2));
    }

}