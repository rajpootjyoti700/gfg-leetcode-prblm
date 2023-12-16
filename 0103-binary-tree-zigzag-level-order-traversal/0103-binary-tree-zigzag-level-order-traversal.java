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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<>();
      if (root == null) return answer;
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      boolean flag = true;
      while (q.size() > 0) {
        int size = q.size();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < size; i++) {
          TreeNode temp = q.remove();
          if (flag) l.addLast(temp.val);
          else l.addFirst(temp.val);
          if (temp.left != null) q.add(temp.left);
          if (temp.right != null) q.add(temp.right);
        }
        answer.add(l);
        flag = !flag;
      }
      return answer;
    }
}