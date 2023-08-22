/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        HashMap<ListNode,Boolean> mp=new HashMap<>();
        while(head!=null){
            if(mp.containsKey(head))
                return head;
            else{
                mp.put(head,true);
                head=head.next;
            }
        }
        return null;
    }
}