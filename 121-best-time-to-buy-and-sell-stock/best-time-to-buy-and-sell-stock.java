class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int ans = 0;

        for(int x: prices){
            minP = Math.min(minP, x);
            ans = Math.max(ans, x - minP);
        }

        return ans;
    }
}