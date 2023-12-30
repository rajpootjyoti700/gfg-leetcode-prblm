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
    
    int ans=0;
    int count=1;
    public int kthSmallest(TreeNode root, int k) {
         if(root==null)
             return 0;
    
        kthSmallest(root.left,k);
        if(count==k)
            ans=root.val;
        count++;

        kthSmallest(root.right,k);
        return ans;
        
    }
}