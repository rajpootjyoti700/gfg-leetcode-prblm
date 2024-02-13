class Solution {
    public boolean poll(String s){
         int j=s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(j))
                j--;
                else
                    return false;
                
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String a: words){
            if(poll(a)==true)
                return a;
        }
    return "";
    }
}