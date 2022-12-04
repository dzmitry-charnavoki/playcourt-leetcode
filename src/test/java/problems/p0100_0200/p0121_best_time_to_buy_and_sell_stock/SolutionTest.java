package problems.p0100_0200.p0121_best_time_to_buy_and_sell_stock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxProfit1() {
        assertEquals(5, new Solution().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    void maxProfit2() {
        assertEquals(0, new Solution().maxProfit(new int[] {7,6,4,3,1}));
    }
}