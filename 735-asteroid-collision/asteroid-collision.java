class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            int a = asteroids[i];

            if(a > 0) st.push(a);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a)) st.pop();

                if(!st.isEmpty() && st.peek() == Math.abs(a)) st.pop();
                else if(st.isEmpty() || st.peek()<0) st.push(a);
            }
           
        }

        int[] ans = new int[st.size()];
        int idx = st.size()-1;

        while(!st.isEmpty()){
            ans[idx--] = st.pop();
        }
        return ans;
    }
}