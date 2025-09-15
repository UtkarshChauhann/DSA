class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(nums[i] < 0) neg.add(nums[i]);
            else pos.add(nums[i]);
        }

        n = pos.size();
        int idx = 0;

        for(int i=0; i<n; i++){
            nums[idx++] = pos.get(i);
            nums[idx++] = neg.get(i);
        }

        return nums;
    }
}