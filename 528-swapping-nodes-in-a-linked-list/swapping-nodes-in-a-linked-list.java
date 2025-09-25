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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode fast = head;

        for(int i=1; i<k; i++){
            first = first.next;
            fast = fast.next;
        }

        while(fast.next != null){
            second = second.next;
            fast = fast.next;
        }

        ListNode temp = new ListNode();
        temp.val = first.val;
        first.val = second.val;
        second.val = temp.val;

        return head;
    }
}