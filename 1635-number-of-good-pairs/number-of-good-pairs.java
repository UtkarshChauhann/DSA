class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int ans = 0;

        for(int x: nums){
            ans += freq[x];

            freq[x] += 1;
        }

        return ans;
    }
}