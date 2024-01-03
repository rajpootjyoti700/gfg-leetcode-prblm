/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // we can apply one by one our all 5 cases
       // base case
        if(root==null)
            return null;
        // case 1
        if(root.val==p.val || root.val==q.val)
            return root;
        //case 2
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null)return right;
        if(right==null)return left;
        return root;
        
    } 
}