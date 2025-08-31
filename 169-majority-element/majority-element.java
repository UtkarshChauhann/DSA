class Solution {
    public int majorityElement(int[] nums) {
        float n = nums.length;
        

        for(int i=0; i<n; i++){
            int num= nums[i];
            int cnt=0;

            for(int j=0; j<n; j++){
                if(nums[j] == num){
                    cnt++;
                }
                
            }
            if(cnt>n/2){
                return nums[i];
            }
        }
        return -1;
        
    }
}