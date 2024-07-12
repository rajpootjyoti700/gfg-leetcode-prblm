class Solution {
    public String simplifyPath(String path) {
        // string builder
        
    //take the array who will contain the string in between / 
        String[] p=path.split("/");
        
       Stack<String> st=new Stack<>(); 
        
        // traverse the each splited component
        
        for(int i=0;i<p.length;i++ ){
            // .. present
            
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
        else
            return sb.toString();
        
    }
}