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
    public boolean hasCycle(ListNode head) {
        // using hash map 
        if(head==null || head.next==null)
            return false;
        HashMap<ListNode,Boolean> mp=new HashMap<>();
        while(head!=null){
            if(mp.containsKey(head))
                return true;
            else{
                mp.put(head,true);
                head=head.next;
                }
        }
        return false;
    }
}