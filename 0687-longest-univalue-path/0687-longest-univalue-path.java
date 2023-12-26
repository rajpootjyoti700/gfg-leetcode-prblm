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
    int result=0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return result;
    }
    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int val=0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(root.left!=null && root.val==root.left.val){
            val=Math.max(val,left+1);
        }
        if(root.right!=null && root.val==root.right.val){
            val=Math.max(val,right+1);
        }
        if(root.left!=null && root.right!=null && root.val==root.left.val && root.val==root.right.val){
            result=Math.max(result,left+right+2);
        }
        result=Math.max(val,result);
        return val;
    }
}