class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, int start, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp)); // add current subset
        
        for (int i = start; i < nums.length; i++) {
            // skip duplicate elements in same recursive level
            if (i > start && nums[i] == nums[i - 1]) continue;
            
            temp.add(nums[i]); // choose the current element
            backtrack(nums, i + 1, temp, ans); // move to next
            temp.remove(temp.size() - 1); // backtrack (undo last choice)
        }
    }
}
