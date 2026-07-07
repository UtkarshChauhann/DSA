class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int maxR = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int a = nums[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(a > 0){
                int num = a%10;
                max = Math.max(max, num);
                min = Math.min(min, num);

                a /= 10;
            }
            int range = max-min;
            arr[i] = range;
            maxR = Math.max(maxR, range);
        }

        int ans = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == maxR){
                ans += nums[i];
            }
        }

        return ans;
    }
}