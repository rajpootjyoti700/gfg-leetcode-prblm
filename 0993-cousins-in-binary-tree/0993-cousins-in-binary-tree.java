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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i;
        int sum=0;
        while(!q.isEmpty()){
            int n=q.size();
            for( i=0;i<n;i++){
                TreeNode node1=q.poll();
                if((node1.left!=null && node1.right!=null) && ((node1.left.val==x && node1.right.val==y)||(node1.left.val==y && node1.right.val==x)))
                    return false;
                if(node1.val==x || node1.val==y)
                    sum++;
                if(node1.left!=null)
                    q.offer(node1.left);
                if(node1.right!=null)
                    q.offer(node1.right);
            }
            if(sum==2)
                return true;
            sum=0;
        }
        return false;
    }
}