class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && ch == '*'){
                st.pop();
            }
            else st.push(ch);
        }

        StringBuilder ans = new StringBuilder();

         while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
