class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        int prevTime = 0;

        for (String log : logs) {

            String[] parts = log.split(":");

            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {

                // Pause the previous function and save its time
                if (!st.isEmpty()) {
                    ans[st.peek()] += time - prevTime;
                }

                // New function starts executing
                st.push(id);
                prevTime = time;

            } else {

                // Current function finishes (+1 because end is inclusive)
                ans[st.pop()] += time - prevTime + 1;

                // Previous function resumes at the next timestamp
                prevTime = time + 1;
            }
        }

        return ans;
    }
}