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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // using recursive call
       // if(root==null)
       //     return new TreeNode(val);
      //  if(val<root.val){
       //     root.left= insertIntoBST(root.left,val);
       // }
       // if(val>root.val){
       //     root.right= insertIntoBST(root.right,val);
       // }
       // return root;
        /* INTERATIVE METHOD */
        TreeNode node =new TreeNode(val);
        TreeNode curr=root;
        TreeNode parent=null;
        while(curr!=null){
            parent=curr;
            if(val<curr.val)
                curr=curr.left;
            else
                    curr=curr.right;
                
        }
        if(parent==null)
            return node;
        else if(val<parent.val)
            parent.left=node;
        else
            parent.right=node;
        return root;
        
    }
}