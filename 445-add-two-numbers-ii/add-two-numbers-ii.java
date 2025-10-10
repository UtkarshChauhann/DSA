
class Solution {
    public ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode nxt = null;
        ListNode curr = l;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode(-1), temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;

            temp.next = new ListNode(sum%10);
            temp = temp.next;
        }

        dummy.next = reverse(dummy.next);

        return dummy.next;
    }
}