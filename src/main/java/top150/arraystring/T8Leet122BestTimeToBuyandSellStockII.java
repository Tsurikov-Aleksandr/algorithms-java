package top150.arraystring;

public class T8Leet122BestTimeToBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxP += prices[i] - prices[i-1];
            }
        }
        return maxP;
    }
}
