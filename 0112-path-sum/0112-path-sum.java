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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        Stack<TreeNode> path=new Stack<>();
        Stack<Integer> pathsum=new Stack<>();
        path.push(root);
        pathsum.push(root.val);
        while(!path.isEmpty()){
            TreeNode temp=path.pop();
            int tempval=pathsum.pop();
            if(temp.left==null && temp.right==null && tempval==targetSum){
                return true;
            }
            if(temp.right!=null){
                path.push(temp.right);
                pathsum.push(temp.right.val+tempval);
                
            }
            if(temp.left!=null){
                path.push(temp.left);
                pathsum.push(temp.left.val+tempval);
            }
        }
        return false;
    }
}