class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String ans="";
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                count++;
            else if(s.charAt(i)==')')
                count--;
            if(count==1 && flag==true){
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