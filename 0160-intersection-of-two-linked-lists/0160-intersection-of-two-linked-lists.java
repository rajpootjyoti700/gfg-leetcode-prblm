/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headB;
        while(temp!=null){
            ListNode temp1=headA;
            while(temp1!=null){
                if(temp1==temp)
                    return temp1;
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return null;
    }
}