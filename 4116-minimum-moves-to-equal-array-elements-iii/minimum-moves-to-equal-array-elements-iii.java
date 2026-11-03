class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int x: nums){
            max = Math.max(max, x);
        }

        int ans = 0;

        for(int x: nums){
            ans += max - x;
        }

        return ans;
    }
}