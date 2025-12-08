class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        Set<String> ops = Set.of("+", "-", "*", "/");

        for(String s: tokens){
            if(!ops.contains(s)){
                int num = Integer.parseInt(s);
                st.push(num);
            }
            else{
                int n2 = st.pop();
                int n1 = st.pop();

                if(s.equals("+")) st.push(n1 + n2);
                else if(s.equals("-")) st.push(n1 - n2);
                else if(s.equals("*")) st.push(n1 * n2);
                else if(s.equals("/")) st.push(n1 / n2);
            }
        }

        return st.peek();
    }
}