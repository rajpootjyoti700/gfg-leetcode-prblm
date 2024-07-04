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
        // thelogic is we will traverse the whole link and when we got 
        // the 0 create a new node nd store the sum value
        //and before that we have to crate the dummy node so that the next dummy will be our 
        // 1st sum nd next to next
        int sum=0;
        ListNode temp1=new ListNode();
        ListNode cur=temp1;
        ListNode temp=head;
        while(temp.next!=null){
            sum=sum+temp.val;
            temp=temp.next;
            if(temp.val==0){
            
                cur.next=new ListNode(sum);
                cur=cur.next;
                sum=0;
            }
            
        }
        return temp1.next;
    }
}