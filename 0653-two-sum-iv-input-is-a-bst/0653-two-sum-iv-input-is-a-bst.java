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
     HashSet<Integer> set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
       // HashSet<Integer> set=new HashSet<>();
        //if(root==null)
         //   return false;
                if(root==null)
            return false;
        int curr=root.val;
        if(set.contains(k-curr))
            return true;
        set.add(curr);
     return  findTarget(root.left,k) || findTarget(root.right,k);
    }
}