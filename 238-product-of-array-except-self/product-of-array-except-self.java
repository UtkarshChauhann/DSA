class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] pre = new int[n];
        pre[0] = nums[0];

        for(int i=1; i<n; i++){
            pre[i] = nums[i] * pre[i-1];
        }

        int[] suf = new int[n];
        suf[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            suf[i] = nums[i] * suf[i+1];
        }

        int[] ans = new int[nums.length];
        ans[0] = suf[1];
        ans[n-1] = pre[n-2];
        
        for(int i=1; i<n-1; i++){
            ans[i] = pre[i-1] * suf[i+1];
        }
        
        return ans;
    }
}