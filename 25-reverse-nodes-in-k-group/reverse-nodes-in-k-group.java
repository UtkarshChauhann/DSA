class Solution {
    private ListNode reverse(ListNode head){
        ListNode prev = null, next = null;
        ListNode curr = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    private ListNode getKthNode(ListNode temp, int k){
        k -= 1;
        while(temp != null && k>0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode kthNode = getKthNode(temp, k);

            if(kthNode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }

            ListNode nextHead = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if(temp == head){
                head = kthNode;
            }else{
                prev.next = kthNode;
            }

            prev = temp;
            temp = nextHead;
        }

        return head;
    }
}