class Solution {
    private void backtrack(int start, int sum, int k, List<Integer> temp, List<List<Integer>> ans){
        if(sum == 0 && temp.size() == k ){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(temp.size() > k || sum < 0) return;

        for(int i=start; i<=9; i++){
            if(sum > 0){
                temp.add(i);
                backtrack(i+1, sum-i, k, temp, ans);
                temp.remove(temp.size()-1);
            } else break;
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(1, n, k, temp, ans);

        return ans;
    }
}