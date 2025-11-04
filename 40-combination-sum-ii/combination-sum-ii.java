class Solution {
    private void func(int i, int target, int[] candidates, List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i == candidates.length || target < 0) return;

        temp.add(candidates[i]);
        func(i+1, target-candidates[i], candidates, temp, ans);

        temp.remove(temp.size() - 1);

        for(int j=i+1; j<candidates.length; j++){
            if(candidates[j] != candidates[i]){
                func(j, target, candidates, temp, ans);
                break;
            }
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        func(0, target, candidates, temp, ans);

        return ans;
    }
}