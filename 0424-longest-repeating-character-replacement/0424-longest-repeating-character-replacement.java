class Solution {
    public int characterReplacement(String s, int k) {
    // the main concept is max window leength -max frequency if this diffrence 
        // exceed the value of k means that we cant convert so we have shrink our window 
        // from the left
        // again keep track the max length;
        int[] arr=new int[26];
        int maxlen=0;
        int maxf=0;
        int l=0;
        int r=0;
        for( r=0;r<s.length();r++){
            // store the freq in the this array
            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);
            if(r-l+1-maxf>k){
                // shrink grom the left
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}