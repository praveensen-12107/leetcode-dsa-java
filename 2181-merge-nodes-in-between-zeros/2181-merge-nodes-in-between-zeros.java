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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode ptr=head.next;
        ListNode ptr2=head.next;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while(ptr!=null){
            while(ptr2.val!=0){
                sum+=ptr2.val;
                ptr2 = ptr2.next;

            }
            
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            ptr2=ptr2.next;
            ptr=ptr2;
            sum=0;
        }
        return ans.next;
        
    }
}