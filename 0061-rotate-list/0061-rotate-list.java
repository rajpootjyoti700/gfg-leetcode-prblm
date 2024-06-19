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
    public ListNode rotateRight(ListNode head, int k) {
     //    ListNode curr=head;
       // while(k!=0){
          //  curr=head;
           // ListNode prev=null;
           // while(curr.next!=null){
             //   prev=curr;
               // curr=curr.next;
             
           // }
           // curr.next=head;
            //curr=head;
           // head=head.next;
           // prev.next=null;
           // k--;
       // }
       // return head
            
            int length=1;
        ListNode temp=head;
        if(k==0 || head==null || head.next==null){
            return head;
        }
        
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        k=k%length;
        
        int start=length-k;
        //connecting last to first
        temp.next=head;
        while(start> 0){
            temp=temp.next;
            start--;
         
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
        
}