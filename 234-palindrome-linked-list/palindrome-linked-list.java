class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow, prev = null, next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode t1 = head;
        ListNode t2 = prev;

        while(t2 != null){
            if(t1.val != t2.val) return false;

            t1 = t1.next;
            t2 = t2.next;
        }

        return true;

    }
}