class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i]) cnt++;
            }
            ans[i] = cnt;
        }

        return ans;
    }
}