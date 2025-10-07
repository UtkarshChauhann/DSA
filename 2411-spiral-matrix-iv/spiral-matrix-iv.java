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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode temp = head;
        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            Arrays.fill(ans[i], -1);
        }

        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;

        while(temp != null){

            for(int j=minc; j<=maxc && temp!=null; j++){
                ans[minr][j] = temp.val;
                temp = temp.next;
            }
            minr++;

            for(int i=minr; i<=maxr && temp!=null; i++){
                ans[i][maxc] = temp.val;
                temp = temp.next;
            }
            maxc--;
        
            for(int j=maxc; j>=minc && temp!=null; j--){
                ans[maxr][j] = temp.val;
                temp = temp.next;
            }
            maxr--;

            for(int i=maxr; i>=minr && temp!=null; i--){
                ans[i][minc] = temp.val;
                temp = temp.next;
            }
            minc++;
             
        }

        return ans;
    }
}