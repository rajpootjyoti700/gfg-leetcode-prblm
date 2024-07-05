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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // we have to keep track the 1st critical point to the last critical point for max
        // and adjent critical point to the min distance.
//         //
//         ListNode pre = head;
//         ListNode cur = head.next;
//         int[] ans = {-1, -1};
//         int prePosition = -1, curPosition = -1, firstPosition = -1, position = 0;
//         while (cur.next != null) {
//             if ((cur.val < pre.val && cur.val < cur.next.val) || (cur.val > pre.val && cur.val > cur.next.val)) {
//                 // local
//                 prePosition = curPosition;
//                 curPosition = position;
//                 if (firstPosition == -1) {
//                     firstPosition = position;
//                 }
//                 if (prePosition != -1) {
//                     if (ans[0] == -1) ans[0] = curPosition - prePosition;
//                     else ans[0] = Math.min(ans[0], curPosition - prePosition);
//                     ans[1] = position - firstPosition;
//                 }
//             }
            
//             position++;
//             pre = cur;
//             cur = cur.next;
//         }
//         return ans;
    //    ***************************************//START//*****************************
        
        // main concept of this ques is we have to keep track  all the position
        //max length is last position and the first position
   
    // but for the min we have to keep track math.min for every adjcent critical point
    ListNode prev=head;
        ListNode temp=head.next;
        int[] ans={-1,-1};
       int  prevpos=-1;
       int first=-1;
        int curp=-1;
        int pos=0;
       while(temp.next!=null){
           if((temp.val<prev.val && temp.val<temp.next.val) || (temp.val>prev.val && temp.val>temp.next.val)){
               // is that we got the critical point 
               prevpos=curp;
               curp=pos;
               if(first==-1){
                   first=pos;
               }
               if(prevpos!=-1){
                   if(ans[0]==-1)
                       ans[0]=curp-prevpos;
                   else
                       ans[0]=Math.min(ans[0],curp-prevpos);
                       ans[1]=curp-first;
                   
               }
               
           }
           pos++;
           prev=temp;
           temp=temp.next;
       }
        return ans;
    }
}