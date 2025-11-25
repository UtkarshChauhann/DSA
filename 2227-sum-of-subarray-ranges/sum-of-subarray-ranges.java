class Solution {
    public long subArrayRanges(int[] nums) {
        //Brute - Without stack
        long res = 0;
        

        for(int i=0; i<nums.length; i++){
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for(int j=i; j<nums.length; j++){
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                res += max-min;
            }
        }
        
        return res;
    }
}