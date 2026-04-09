class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 == 1) return false;

        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '('){
                st.push(')');
            } else if(c == '{'){
                st.push('}');
            } else if(c == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != c) return false;
        }

        if(!st.isEmpty()) return false;

        return true;
    }
}