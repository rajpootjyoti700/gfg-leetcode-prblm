class Solution {
    public boolean isIsomorphic(String s, String t) {
      char[] stot=new char[256];
        char[] ttos=new char[256];

        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(stot[sc]==0 && ttos[tc]==0){
                stot[sc]=tc;
                ttos[tc]=sc;
            }
            else if(stot[sc]!=tc){
                return false;
            }
        }
        return true;  
    }
}