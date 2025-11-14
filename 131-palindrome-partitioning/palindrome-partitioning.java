class Solution {
    private boolean isPalindrome(int start, int end, String s){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    private void dfs(int idx, String s, List<String> path, List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=idx; i<s.length(); i++){
            if(isPalindrome(idx, i, s)){
                path.add(s.substring(idx, i+1));
                dfs(i+1, s, path, ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        dfs(0, s, path, ans);

        return ans;
    }
}