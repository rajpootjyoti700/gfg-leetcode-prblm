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
    ArrayList<Integer> list=new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root!=null){
        findTarget(root.left,k);
        list.add(root.val);
        findTarget(root.right,k);
        }
        
        int n=list.size();
       int l=0;
       int r=n-1;
        while(l<r){
            if(list.get(l)+list.get(r)==k)
                return true;
            if(list.get(l)+list.get(r)>k)
                r--;
                else
                    l++;
        }
        return false;
    }
}