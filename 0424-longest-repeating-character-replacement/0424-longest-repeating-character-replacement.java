class Solution {
    public int characterReplacement(String s, int k) {
      // int[] arr = new int[26];
      //  int largestCount = 0, start = 0, maxlen = 0;
       // for(int end = 0; end < s.length(); end ++){
          //  arr[s.charAt(end) - 'A']++;
           // largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
           // if(end - start + 1 - largestCount > k){ 
            //    arr[s.charAt(start) - 'A']--;
            ////    start ++;
          //  }
          //  maxlen = Math.max(maxlen, end - start + 1);
       // }
       // return maxlen; 
        
        // so the approach is taking a 26 size array  which contain frequency of each character
        //we have to find out the maxlength-  maxfrequncy if this diff is grater than k then break. becoz this diff is the no of changes requiered.
        int[] arr=new int[26];
        int maxf=0;
        int maxlen=0;
        int l=0;
        int r=0;
        for( r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);
            
            if(r-l+1-maxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}