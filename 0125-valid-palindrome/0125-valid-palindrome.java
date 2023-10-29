class Solution {
    public boolean isPalindrome(String s) {
      String str=s.toLowerCase();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i)))
                ans=ans+str.charAt(i);
        }
        int j=ans.length()-1;
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)!=ans.charAt(j))
              return false;
            j--;
        }
        return true;
    }
}