class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int prev = 0;

        for (String log : logs) {
            String[] p = log.split(":");
            int id = Integer.parseInt(p[0]);
            String type = p[1];
            int time = Integer.parseInt(p[2]);

            if (type.equals("start")) {
                if (!st.isEmpty()) {
                    ans[st.peek()] += time - prev;
                }
                st.push(id);
                prev = time;
            } else { // end
                ans[id] += time - prev + 1;
                st.pop();
                prev = time + 1;
            }
        }
        return ans;
    }
}
