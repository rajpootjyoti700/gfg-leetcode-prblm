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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<ArrayList> s=new Stack<>();
        ArrayList<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node1= q.poll();
                list.add(node1.val);
                if(node1.left!=null)
                    q.offer(node1.left);
                if(node1.right!=null)
                    q.offer(node1.right);
            }
            s.push(list);
        }
        ArrayList<Integer> list1=new ArrayList<>();
        
        while(!s.isEmpty()){
            list1=s.pop();
            ans.add(list1);
        }
        return ans;
    }
}