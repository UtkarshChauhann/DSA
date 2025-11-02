class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next != null && temp.next.next != null){
            ListNode a = temp.next;
            ListNode b = a.next;

            //swapping
            a.next = b.next;
            b.next = a;
            temp.next = b; 

            temp = a; //moving for swaping next pair
        }

        return dummy.next;
    }
}