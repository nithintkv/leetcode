public class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE, profit = -1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy)
                minBuy = prices[i];
            else
                if (prices[i] - minBuy > profit)
                    profit = prices[i] - minBuy;
        }
        if (profit > -1)
            return profit;
        else return 0;
    }
}
