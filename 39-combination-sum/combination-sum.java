class Solution {
    private void combinations(int i, int target, int[] candidates, List<Integer> l,  List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList(l));
            return;
        }
        if(i == candidates.length || target < 0) return;

        l.add(candidates[i]);
        combinations(i, target-candidates[i], candidates, l, ans);

        l.remove(l.size()-1);
        combinations(i+1, target, candidates, l, ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        combinations(0, target, candidates, l, ans);

        return ans;
    }
}