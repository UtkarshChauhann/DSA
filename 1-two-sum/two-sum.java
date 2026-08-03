class Solution {
    public int[] twoSum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            if(hm.containsKey(k - nums[i])){
                return new int[]{hm.get(k - nums[i]), i};
            }

            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}