
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1), temp = newHead;

        ListNode t1 = l1, t2 = l2;
        int carry = 0;

        while(t1 != null || t2 != null || carry != 0){
            int sum = 0;

            if(t1 != null){
                sum = sum + t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum = sum + t2.val;
                t2 = t2.next;
            }

            sum += carry;

            carry = sum/10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;         

        }

        temp.next = null;

        return newHead.next;
    }
}