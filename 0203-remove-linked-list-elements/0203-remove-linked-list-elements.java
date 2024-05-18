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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        while (head != null && head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }

        ListNode dummyHead = head;
        while (dummyHead.next != null) {
            if (dummyHead.next.val == val) {
                dummyHead.next = dummyHead.next.next;
            } else {
                dummyHead = dummyHead.next;
            }
        }
        return head;
    }
}