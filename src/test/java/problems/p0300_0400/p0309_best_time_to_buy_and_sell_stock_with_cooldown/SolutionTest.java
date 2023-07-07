package problems.p0300_0400.p0309_best_time_to_buy_and_sell_stock_with_cooldown;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxProfit() {
        assertEquals(3, new Solution().maxProfit(new int[] {1, 2, 3, 0, 2}));
    }

    @Test
    void maxProfit1() {
        assertEquals(0, new Solution().maxProfit(new int[] {1}));
    }
}