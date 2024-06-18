class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
       int count=0;
        int m=t.length();
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(s.charAt(i)==t.charAt(j)){
                if(j>=k){
                k=j+1;
                   count++; 
                    break;
                }
                
            }
                
            }     
        }
         if(count==n)
             return true;
        else 
            return false;
    }
}