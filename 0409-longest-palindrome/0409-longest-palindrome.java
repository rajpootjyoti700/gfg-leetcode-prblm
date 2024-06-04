class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int ans=0;
        int odd=0;
        for(int i=0;i<n;i++){
          if(mp.containsKey(s.charAt(i))){
              mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
          }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        
        for(int a : mp.values()){
            if(a%2==0){
                ans=ans+a;
            }
               else{
                   ans=ans+a-1;
                   odd=1;
               }
        }
               return ans+odd;
    }
}