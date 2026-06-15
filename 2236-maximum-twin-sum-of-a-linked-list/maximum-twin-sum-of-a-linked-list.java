class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            st.push(slow.val);

            slow = slow.next;
            fast = fast.next.next;
        }

        int ans = 0;

        while(slow != null){
            int sum = st.pop() + slow.val;
            ans = Math.max(ans, sum);

            slow = slow.next;
        }

        return ans;
    }
}