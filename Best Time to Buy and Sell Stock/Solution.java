class Solution {
    public int maxProfit(int[] prices) {
        
        int day1 = Integer.MAX_VALUE;
        int profit_today = 0;
        int profit = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i] < day1){
                day1 = prices[i];
            }

            profit_today = prices[i] - day1;

            if(profit_today > profit){
                profit = profit_today;
            }
        }

        return profit;











    }
}
