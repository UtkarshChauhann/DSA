class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
         
        int start = 0;
        int end = n - 1;

        for(int i = 0; i< nums.length ; i++){
           if(nums[i]>=0){
            arr[start++] = nums[i];

           }else{
            arr[end--]=nums[i];
           }
        }

        int[] ans= new int[n];

        start = 0; end = n-1;

        for(int i =0 ; i<n ; i++){
            if(i % 2 == 0){
                ans[i] = arr[start++];
            }else{
                ans[i] = arr[end--];
            }
        }
        return ans;
    }
}