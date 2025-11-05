class Solution {
    private void func(int i, int target, int[] candidates, List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i == candidates.length || target < 0) return;

       
          for(int j=i; j<candidates.length; j++){
            if(j > i && candidates[j] == candidates[j-1]) continue;

            temp.add(candidates[j]);
            func(j+1, target-candidates[j], candidates, temp, ans);
            temp.remove(temp.size() - 1);
            
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