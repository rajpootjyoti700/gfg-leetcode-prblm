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
    TreeNode curr=new TreeNode(0);
    
    public void helper(TreeNode root){
        if(root==null)
            return;
        helper(root.left);
        curr.right=root;
        curr=root;
        root.left=null;
        helper(root.right);
        
    }
    public TreeNode increasingBST(TreeNode root) {
        
        TreeNode temp=curr;
        helper(root);
        return temp.right;
    }
}