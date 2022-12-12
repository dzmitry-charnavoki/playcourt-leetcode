package problems.p1400_1500.p1491_average_salary_excluding_the_minimum_and_maximum_salary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void average0() {
        assertEquals(41111.11111, new Solution().average(new int[] {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000}), 1e-5);
    }

    @Test
    void average11() {
        assertEquals(2500, new Solution().average(new int[] {4000, 3000, 1000, 2000}));
    }

    @Test
    void average12() {
        assertEquals(2000, new Solution().average(new int[] {1000, 2000, 3000}));
    }

    @Test
    void average13() {
        assertEquals(2500, new Solution().average(new int[] {4000, 3000, 2000, 1000}));
    }

    @Test
    void average14() {
        assertEquals(2500, new Solution().average(new int[] {1000, 2000, 3000, 4000}));
    }
}