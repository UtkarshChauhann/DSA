class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int n  = nums.length;
        int XOR = 0;

        for(int i=1; i<n; i++){
            if(nums[i-1] == nums[i]){
                XOR ^= nums[i];
                //i++;
            }
        }

        return XOR;
    }
}