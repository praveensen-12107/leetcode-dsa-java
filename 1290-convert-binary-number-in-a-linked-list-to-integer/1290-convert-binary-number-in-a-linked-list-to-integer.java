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
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    public int getDecimalValue(ListNode head) {
        ListNode rHead=reverse(head);
        int index=0;
        int sum=0;
        while(rHead!=null){
            
            if(rHead.val==1){
                int pow=1;
                for(int i=0;i<index;i++){
                    pow*=2;

                    
                }
                sum+=pow;
                index++;
                rHead=rHead.next;
                
            }
            else{
                sum+=0;
                index++;
                rHead=rHead.next;
            }
            


        }
        return sum;
        
    }
}