class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String ans="";
        boolean flag=true;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                count++;
            else if(s.charAt(i)==')')
                count--;
            if(flag==true && count==1){
                flag=false;
                continue;
            }
            if(count==0 && flag==false){
                flag=true;
                continue;
            }
    
            ans=ans+s.charAt(i);
            
        }
            return ans;
    }
}