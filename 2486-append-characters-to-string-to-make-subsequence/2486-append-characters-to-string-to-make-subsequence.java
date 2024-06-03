class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
         int k=t.length();
        int i=0;
        int j=0;
        while(n>0 && m>0){
            if(t.charAt(i)==s.charAt(j)){
                k--;
                i++;
                j++;
                n--;
                m--;
                
            }
            else{
                j++;
                n--;
                
            }
        }
        return k;
    }
}