package problems.p0300_0400.p0309_best_time_to_buy_and_sell_stock_with_cooldown;

class Solution {

    public int maxProfit(int[] prices) {
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        int prev = 0;

        for (final int price : prices) {
            final int cache = sell;
            sell = Math.max(sell, hold + price);
            hold = Math.max(hold, prev - price);
            prev = cache;
        }

        return sell;
    }

}
