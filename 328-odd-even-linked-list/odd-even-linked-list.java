
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        
        ListNode odd = dummy1;
        ListNode even = dummy2;
        ListNode temp = head;
        int n = 1;

        while(temp != null){
            if(n % 2 != 0){
                odd.next = temp;
                odd = odd.next;
            }
            else{
                even.next = temp;
                even = even.next;
            }
            n++;
            temp = temp.next;
        }

        even.next = null;
        odd.next = dummy2.next;

        return dummy1.next;
    }
}