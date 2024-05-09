package top150.dpmultidimensional;

public class T149Leet188BestTimeЕoBuyandSellStockIV {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] after = new int[2][k + 1];
        int[][] curr = new int[2][k + 1];
        int profit;

        for (int idx = n - 1; idx >= 0; idx--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= k; cap++) {
                    if (buy == 1) {
                        profit = Math.max(-prices[idx] + after[0][cap], after[1][cap]);
                    } else {
                        profit = Math.max(prices[idx] + after[1][cap - 1], after[0][cap]);
                    }
                    curr[buy][cap] = profit;
                }
            }

            after = curr;
        }

        return after[1][k];
    }
}
