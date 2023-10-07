class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result =new ArrayList<>();
        parenthesis("(",1,0,result,n);
        return result;
    }
        
        void parenthesis(String curr,int o,int c,List<String> result,int n){
                         if(curr.length()==2*n){
                             result.add(curr);
                             return;
                             
                         }
            if(o<n){
                parenthesis(curr+"(",o+1,c,result,n);
            }
            if(c<o){
                parenthesis(curr+")",o,c+1,result,n); 
            }
            
                
        }
        
        
    }
