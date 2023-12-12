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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                list.add(q.poll().val);
            }
            ans.add(list);
        }
        return ans;
    }
}