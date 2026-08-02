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
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;

    }
    public ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
    public int[] nextLargerNodes(ListNode head) {
        if(head == null){
           return new int[0];
        }
        int size=sizeLL(head);
        int ans [] = new int [size];
        ListNode nHead= reverseLL(head);
        Stack<Integer> st = new Stack<>();
        st.push(nHead.val);
        int ptr = size-2;
        ListNode curr=nHead.next;
        while(ptr>=0){
            int ele =  curr.val;
            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }
            if(st.size()==0){
                ans[ptr]=0;

            }
            else{
                ans[ptr]=st.peek();

            }
            st.push(ele);
            curr=curr.next;
            ptr--;

        }
        return ans;

        
    }
}