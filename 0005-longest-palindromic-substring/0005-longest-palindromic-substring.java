class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=1;
        int strt=0,end=0;
        if(s.length()==1)
            return s;
        // for odd length;
        for(int i=0;i<n-1;i++){
            int l=i,r=i;
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else
                    break;
            }
            int len=r-l-1;
            if(len>maxlen){
                maxlen=len;
            strt=l+1;
            end=r-1;
            }
            
        }
        // for even length
                for(int i=0;i<n-1;i++){
            int l=i,r=i+1;
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else
                    break;
            }
            int len=r-l-1;
            if(len>maxlen){
                maxlen=len;
            strt=l+1;
            end=r-1;
            }
                }
        return s.substring(strt,end+1);
            
    }
}