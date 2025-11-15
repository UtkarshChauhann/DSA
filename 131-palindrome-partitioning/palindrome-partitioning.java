class Solution {
    private boolean isPalindrome(int start, int end, String s){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    private void dfs(int idx, String s, List<String> sub, List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(sub));
            return;
        }

        for(int i=idx; i<s.length(); i++){
            if(isPalindrome(idx, i, s)){
                sub.add(s.substring(idx, i+1));
                dfs(i+1, s, sub, ans);
                sub.remove(sub.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> sub = new ArrayList<>();

        dfs(0, s, sub, ans);

        return ans;
    }
}