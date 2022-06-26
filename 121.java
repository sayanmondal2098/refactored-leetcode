class P121 {
    public int maxProfit(int[] prices) {
        int max_profit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<buy) {
                buy = prices[i];
            }
            else if (max_profit < prices[i] - buy) {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }    
}
