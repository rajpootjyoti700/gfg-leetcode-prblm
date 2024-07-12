class Solution {
    public String simplifyPath(String path) {
        //we have to remove .. nd // nd . from this string 
        // so we need String builder becoz we want to perform 
        // some modify operation on this string
        
        // so 1stly we can split this string into the component where 
        // single / present 
        // then try to remove // . and .. 
        
        // step1 take the stack of string
        
        Stack<String> st=new Stack<>();
        int n=path.length();
        String[] p=path.split("/");
        
        for(int i=0;i<p.length;i++){
            if(p[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            
            else if(!p[i].equals("") && !p[i].equals(".")){
                st.push(p[i]);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty()){
            
            sb.insert(0,st.pop()).insert(0,"/");
        }
        
        if(sb.length()==0){
            return "/";
        }
        
        else{
            return sb.toString();
        }
    }
}