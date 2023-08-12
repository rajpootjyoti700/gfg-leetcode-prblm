class Solution {
    public String reverseWords(String s) {
        int i=0;
        int n=s.length();
        int j;
        String result="";
        while(i<n){
            while(i<n && s.charAt(i)==' ')
                i++;
            if(i>=n)
                break;
            j=i+1;
            while(j<n && s.charAt(j)!=' ')
                j++;
            String w=s.substring(i,j);
            i=j+1;
            if(result.length()==0)
                result=w;
            else
            result=w+" "+result;
            
        }
        return result;
    }
}