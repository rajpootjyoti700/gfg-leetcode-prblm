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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
       // ListNode temp=head;
       // ListNode curr=head.next;
        ListNode prev=null;
        while(head!=null){
            ListNode curr=head.next;
            head.next=prev;
            prev=head;
            head=curr;
            //curr=curr.next;
            
        }
        return prev;
    }
}