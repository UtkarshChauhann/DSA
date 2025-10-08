
class Solution {
    public void reverse(ListNode head){
        ListNode prev = null;
        ListNode nxt = null;
        ListNode curr = head;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        ListNode temp = head;
        int pos = 1;

        while(temp != null){
            if(pos == left-1) a = temp;
            if(pos == left) b = temp;
            if(pos == right) c = temp;
            if(pos == right+1) d = temp;

            temp = temp.next;
            pos++;
        }
        
        if(a != null) a.next = null; 
        if(c != null) c.next = null;
       
        reverse(b);
        
        if(a != null) a.next = c;
        b.next = d;

        if(a == null) return c;

        return head;
    }
}