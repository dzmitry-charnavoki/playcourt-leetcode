package problems.p1400_1500.p1491_average_salary_excluding_the_minimum_and_maximum_salary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void average11() {
        assertEquals(2500, new Solution().average(new int[]{4000,3000,1000,2000}));
    }

    @Test
    void average12() {
        assertEquals(2000, new Solution().average(new int[]{1000,2000,3000}));
    }

}