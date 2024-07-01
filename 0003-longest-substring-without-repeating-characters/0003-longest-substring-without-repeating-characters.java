class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length();
        int len=0;
        while(j<s.length()){
            if(mp.containsKey(s.charAt(j))){
                i=Math.max(mp.get(s.charAt(j))+1,i);
            }
            
                mp.put(s.charAt(j),j);
                len=Math.max(len,j-i+1);
            j++;
            
        }
        return len;
    }
}