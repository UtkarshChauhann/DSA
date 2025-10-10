
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
        //Without Reversing ->
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode t1 = l1, t2 = l2;

        while(t1 != null){
            s1.push(t1.val);
            t1 = t1.next;
        }
        while(t2 != null){
            s2.push(t2.val);
            t2 = t2.next;
        }

        ListNode head = null;
        int carry = 0;

        while(! s1.isEmpty() || ! s2.isEmpty() || carry != 0){
            int sum = carry;

            if(! s1.isEmpty()){
                sum += s1.pop();
            }
            if(! s2.isEmpty()){
                sum += s2.pop();
            }

            carry = sum/10;

            ListNode node = new ListNode(sum%10);
            node.next = head;
            head = node;
        }


        return head;
    }
}