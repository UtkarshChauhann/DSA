class Solution {
    private void generate(int i, int[] nums, List<Integer> l, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        generate(i + 1, nums, l, ans);

        l.remove(l.size() - 1);
        generate(i + 1, nums, l, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        generate(0, nums, l, ans);

        return ans;
    }
}