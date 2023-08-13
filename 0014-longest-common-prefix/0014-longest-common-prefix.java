class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        //String str1=strs[0];
        //String str2=strs[strs]
        while(i<strs[0].length()){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
                i++;
        else
            break;
        if(i==0)
            return "";
        }
                   return strs[0].substring(0,i);
 
    }
}