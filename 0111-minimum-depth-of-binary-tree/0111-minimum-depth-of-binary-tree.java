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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        ArrayList<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int c=1;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
            TreeNode r=q.poll();
        
            if(r.left==null && r.right==null)
                return c;
            if(r.left!=null)
                q.offer(r.left);
            if(r.right!=null)
                q.offer(r.right);
        }
            c++;
        }
        return c;
    }
}