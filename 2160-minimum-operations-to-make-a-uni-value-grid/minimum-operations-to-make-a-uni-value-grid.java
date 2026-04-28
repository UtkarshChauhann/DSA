class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        int[] nums = new int[m*n];
        int idx = 0;

        for(int[] row: grid){
            for(int i: row){
                nums[idx++] = i;
            }
        }
        Arrays.sort(nums);

        int target = nums[nums.length / 2];
        int ans = 0;

        for(int i: nums){
            int temp = Math.abs(i - target);
            if(temp % x != 0) return -1;
            ans += temp/x;
        }

        return ans;
    }
}