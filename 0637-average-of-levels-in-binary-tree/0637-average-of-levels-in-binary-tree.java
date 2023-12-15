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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return list;
        q.offer(root);
       // double sum=0.0;
            while(!q.isEmpty()){
            int n=q.size();
            double sum=0.0;
                for(int i=0;i<n;i++){
                    TreeNode node1= q.poll();
                    sum=sum+node1.val;
                    if(node1.left!=null)
                        q.offer(node1.left);
                    if(node1.right!=null)
                        q.offer(node1.right);
                    
                }
                list.add(sum/n);
        }
        return list;
    }
}