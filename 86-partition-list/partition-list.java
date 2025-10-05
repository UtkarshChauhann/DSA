/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        ListNode a = dummy1;
        ListNode b = dummy2;
        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                a.next = temp;
                a = a.next;
            }
            else{
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
        }
        b.next = null;
        a.next = dummy2.next;

        return dummy1.next;
    }
}