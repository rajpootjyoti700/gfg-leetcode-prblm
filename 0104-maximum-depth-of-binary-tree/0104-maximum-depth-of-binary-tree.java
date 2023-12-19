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
    public int maxDepth(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return 0;
        q.offer(root);
        int c=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node1=q.poll();
                if(node1.left!=null)
                    q.offer(node1.left);
                if(node1.right!=null)
                    q.offer(node1.right);
            }
            c++;
        }
        return c;
    }
}