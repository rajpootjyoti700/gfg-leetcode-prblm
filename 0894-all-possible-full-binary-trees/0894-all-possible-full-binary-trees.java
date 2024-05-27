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
    public List<TreeNode> allPossibleFBT(int n) {
         List<TreeNode>[] memo = new ArrayList[n+1];
        return helper(n, memo);
    }

    List<TreeNode> helper(int n, List<TreeNode>[] memo) {
        if(memo[n]!=null) {
            return memo[n];
        }
        List<TreeNode> list = new ArrayList<>();
        if(n == 1) {
            list.add(new TreeNode(0));
            return list;
        }
        if(n%2 == 0) {
            // return the empty list. We cannot form a full binary tree 
            // without n = 1, 3, 5, 7 and so on..
            return list;
        }

        for(int i=2; i<=n; i+=2) {
            // find list of left and right nodes using odd n.
            // for n = 7 and i=2 => i-1 = 1 and n-i = 5
            // so, we are finding the list for every odd pair like (1, 5), (3, 3), (5, 1)
            List<TreeNode> left = helper(i-1, memo);
            List<TreeNode> right = helper(n-i, memo);
            for(TreeNode leftNode : left) {
                for(TreeNode rightNode : right) {
                    list.add(new TreeNode(0, leftNode, rightNode));
                }
            }
        }
        return memo[n] = list;
    }
}