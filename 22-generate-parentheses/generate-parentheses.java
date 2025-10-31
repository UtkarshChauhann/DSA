class Solution {
    private void generate(List<String> ans, String s, int open, int close, int n){
        if(open == close && open + close == 2*n){
            ans.add(s);
            return;
        }
        
        if(open < n){
            generate(ans, s + '(', open+1, close, n);
        }
        if(close < open){
            generate(ans, s + ')', open, close+1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String s = "";

        generate(ans, s, 0, 0, n);

        return ans;
    }
}