class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(') st.push('(');
            else{
                cnt++;
                if(!st.isEmpty()){
                    st.pop();
                    cnt--;
                }
            }
        }

        if(st.isEmpty() && cnt>0) return cnt;

        return st.size() + cnt;
    }
}