/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    ArrayList<Integer> ans=new ArrayList<>();
        public List<Integer> postorder(Node root) {
        helper(root); 
        return ans; 
    }
    private void helper (Node root){
        if (root==null) return ; 
        for (Node i: root.children){
            helper(i); 
        }
        ans.add(root.val); 
    }
}