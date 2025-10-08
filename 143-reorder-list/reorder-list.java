
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null, nxt = null, curr = head;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverse(slow.next);
        slow.next = null;

        ListNode dummy = new ListNode(-1), curr = dummy, t1 = head, t2 = head2;

        while(t1 != null && t2 != null){
            curr.next = t1;
            t1 = t1.next;
            curr = curr.next;
            
            curr.next = t2;
            t2 = t2.next;
            curr = curr.next;
        }

        if(t1 == null) curr.next = t2;
        if(t2 == null) curr.next = t1;

    }
}