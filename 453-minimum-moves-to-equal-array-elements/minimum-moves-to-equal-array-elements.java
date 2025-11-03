class Solution {
    public int minMoves(int[] nums) {
        int mini = Integer.MAX_VALUE;

        for(int num: nums){
            mini = Math.min(mini, num);
        }
        int cnt = 0;

        for(int num: nums){
            cnt += num - mini;
        }

        return cnt;
    }
}