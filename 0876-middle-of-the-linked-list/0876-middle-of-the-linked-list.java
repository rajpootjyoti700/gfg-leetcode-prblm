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
    public ListNode middleNode(ListNode head) {
        // normal method brute force approach
        ListNode curr =head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        int n=count/2;
        ListNode temp=head;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        return temp;
        
    }
}