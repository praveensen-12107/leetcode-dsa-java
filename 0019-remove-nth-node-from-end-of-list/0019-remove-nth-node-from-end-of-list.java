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
        if(head==null){
            return 0;
        }
        int count = 0;
        ListNode ptr=head;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count ;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode ptr=head;
        int size = sizeLL(head);
        if(n==size){
            return head.next;
        }
        int nth_ele=size-n-1;
        while(nth_ele>0){
            ptr=ptr.next;
            nth_ele--;
        }
        ptr.next=ptr.next.next;
        return head;
        
    }
}