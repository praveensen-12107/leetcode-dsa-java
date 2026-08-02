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
    public int sizeLL(ListNode head){
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        int size = sizeLL(head);
        
        
        ListNode curr = head;
        int removeIndex = size / 2;
        int i=removeIndex-1;
        while(i>0 && curr!=null){
            curr=curr.next;
            i--;
            
            
        }
        curr.next=curr.next.next;
        
        return head;

        
    }
}