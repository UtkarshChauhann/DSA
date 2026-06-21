class Solution {
    public boolean valid(long sum, int x){
        if(sum % 10 != x) return false;

        while(sum >= 10){
            sum /= 10;
        }

        return sum == x;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int ans = 0;
        
        for(int i=0; i<n; i++){
            long sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];

                if(valid(sum, x)) ans++;
            }
        }

        return ans;
    }
}