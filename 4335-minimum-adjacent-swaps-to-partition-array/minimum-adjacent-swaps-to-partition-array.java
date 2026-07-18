class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long MOD = 1_000_000_007;
        long mid = 0;
        long high = 0;
        long swaps = 0;

        for(int x: nums){
            if(x < a){
                swaps += mid + high;
            } else if(x <= b){
                swaps += high;
                mid++;
            }
            else high++;

            swaps %= MOD;
        }

        return (int)swaps;
    }
}