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
        ListNode temp=head;
        ListNode temp1=new ListNode();
       ListNode cur=temp1;
        
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