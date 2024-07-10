class Solution {
    public int minOperations(String[] logs) {
        int depth=0;
        for(String arr: logs){
            if(arr.equals("../")){
                if(depth>0)
                    depth--;
            }
            else if(!arr.equals("./")){
                depth++;
            }
        }
        return depth;
    }
}