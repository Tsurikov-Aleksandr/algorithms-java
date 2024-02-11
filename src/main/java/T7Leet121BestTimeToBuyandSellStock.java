public class T7Leet121BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxP = 0;
        while (sell < prices.length){
            if(prices[buy] > prices[sell]){
                buy = sell;
            }
            maxP = Math.max(maxP, (prices[sell] - prices[buy]));
            sell++;
        }
        return maxP;
    }
}
