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
    public boolean isPalindrome(ListNode head) {
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = newHead;
        ListNode t2 = head.next;

        while(t2 != null){
            ListNode temp = new ListNode(t2.val);
            t1.next = temp;
            t1 = t1.next;
            t2 = t2.next;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        
        t1 = newHead;
        t2 = head;

        while(t1 != null){
            if(t1.val != t2.val) return false;

            t1 = t1.next;
            t2 = t2.next;
        }

        return true;

    }
}