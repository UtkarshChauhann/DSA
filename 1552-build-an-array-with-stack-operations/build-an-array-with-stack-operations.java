class Solution {
    public List<String> buildArray(int[] target, int n) {

        Stack<Integer> st = new Stack<>();
        List<String> ans = new ArrayList<>();

        int i = 1, idx = 0;

        while(idx < target.length){
            st.push(i);
            ans.add("Push");

            if(i != target[idx]){
                st.pop();
                ans.add("Pop");
            }
            else idx++;
            i++;
        }

        return ans;
    }
}