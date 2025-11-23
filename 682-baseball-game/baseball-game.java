class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<operations.length; i++){
            String s = operations[i];
            if(s.equals("+")){
                int top = st.pop();
                int sum = top + st.peek();
                st.push(top);
                st.push(sum);
            }
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("C")) st.pop();
            else{
                st.push(Integer.parseInt(s));
            }
        }
        
        int res = 0;

        while(!st.isEmpty()){
            res += st.pop();
        }

        return res;
    }
}
