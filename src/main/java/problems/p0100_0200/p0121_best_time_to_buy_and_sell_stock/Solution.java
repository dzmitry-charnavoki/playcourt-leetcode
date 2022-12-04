package problems.p0100_0200.p0121_best_time_to_buy_and_sell_stock;

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                profit = Math.max(profit, price - minPrice);
            }

        }
        return profit;
    }
}
