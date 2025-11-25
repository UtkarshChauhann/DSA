class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];

        st.push(heights[n-1]);
        ans[n-1] = 0;

        for(int i=n-2; i>=0; i--){
            int cnt = 0;
            while(!st.isEmpty() && st.peek() < heights[i]){
                st.pop();
                cnt++;
            }
            if(!st.isEmpty()) cnt++;
            ans[i] = cnt;

            st.push(heights[i]);
        }

        return ans;
    }
}