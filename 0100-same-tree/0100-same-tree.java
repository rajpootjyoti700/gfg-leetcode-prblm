/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> mp=new LinkedList<>();
        mp.offer(p);
        mp.offer(q);
        while(!mp.isEmpty()){
TreeNode node1=mp.poll();
 TreeNode node2=mp.poll();
            if(node1==null && node2==null)
                continue;
            if( node1==null || node2==null || node1.val!=node2.val)
                return false;
            mp.offer(node1.left);
            mp.offer(node2.left);
            mp.offer(node1.right);
            mp.offer(node2.right);
        }
        return true;
    }
}