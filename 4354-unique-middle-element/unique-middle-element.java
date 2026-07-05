class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(i == n/2) continue;
            else set.add(nums[i]);
        }

        if(set.contains(nums[n/2])) return false;

        return true;
    }
}