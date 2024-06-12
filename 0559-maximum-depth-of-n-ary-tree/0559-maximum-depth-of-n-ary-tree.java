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
        int max=0;
    public void help(Node root,int l){
        if(root==null)  return;
        max=Math.max(max,l);
        if(root.children==null) return;
        for(Node c: root.children)    help(c,l+1);
    }
    public int maxDepth(Node root) {
        help(root,1);
        return max;
    }
    }
