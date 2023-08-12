class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        if(num.charAt(n-1)%2!=0){
            return num;
        }
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                String w=num.substring(0,i+1);
                return w;
            }
        }
        return "";
    }
}