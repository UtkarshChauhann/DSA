class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int small = 0;
        int t = 0;

        for(int x: nums){
            if(x < target){
                small++;
                t++;
            } 
            else if(x == target)  t++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=small; i<t; i++){
            ans.add(i);
        }

        return ans;
    }
}