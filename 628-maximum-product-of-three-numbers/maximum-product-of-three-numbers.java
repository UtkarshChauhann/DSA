class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int prod1 = nums[n-3]*nums[n-2]*nums[n-1];
        int prod2 = nums[0]*nums[1]*nums[n-1];

        return Math.max(prod1, prod2);






        
        // int n = nums.length;
        // int cnt = 1, prod = 1;
        // int ans = Integer.MIN_VALUE;

        // for(int i=0; i<n-1; i++){
        //     prod = nums[i];
        //     for(int j=i+1; j<n; j++){
        //         prod *= nums[j];
        //         cnt++;
        //         ans = Math.max(ans, prod);

        //         if(cnt == 3){
        //             cnt = 1;
        //             prod = nums[i];
        //         }
        //     }
        // }

        // return ans;
    }
}