class Solution {
    private void backtrack(int start, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start; i<=n; i++){
            temp.add(i);
            backtrack(i+1, n, k, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(1, n, k, temp, ans);
        return ans;
    }
}