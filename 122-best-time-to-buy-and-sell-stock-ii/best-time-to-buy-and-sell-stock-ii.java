class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int less = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0; i<n; i++){
            less = Math.min(less, prices[i]);
            if(prices[i] > less){
                ans += prices[i] - less;
                less = prices[i];
            }
        }

        return ans;
    }
}