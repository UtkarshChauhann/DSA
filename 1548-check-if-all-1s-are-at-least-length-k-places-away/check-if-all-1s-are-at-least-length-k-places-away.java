class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                if(cnt == -1) cnt = 0;
                else{
                    if(cnt < k) return false;
                    cnt = 0;
                }
            } 
            else if(cnt != -1) cnt++;
        }

        return true;
    }
}