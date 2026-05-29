class Solution {
    public int minElement(int[] nums) {
        int idx = 0;
        int min = Integer.MAX_VALUE;

        for(int num: nums){
            int sum = 0;
            while(num > 0){
                int a = num%10;
                num /= 10;

                sum += a;
            }
            nums[idx++] = sum;
            min = Math.min(min, sum);
        }

        return min;
    }
}