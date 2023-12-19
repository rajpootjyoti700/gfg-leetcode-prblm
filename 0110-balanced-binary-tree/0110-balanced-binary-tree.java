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
    public boolean isBalanced(TreeNode root) {
        height(root);
        return isbal;
    }
    boolean isbal=true;
    public  int height(TreeNode root){
        if(root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        int gap=Math.abs(lh-rh);
        if(gap>1)
            isbal=false;
        int th=Math.max(lh,rh)+1;
        return th;
    }
}