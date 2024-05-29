class Solution {
    public int numSteps(String s) {
        int n=s.length();
        int x=0;
        int y=0;
        for(int i=n-1;i>=1;i--){
            if((s.charAt(i)-'0'+y)==1 ){
                y=1;
                x+=2;
            }
            else{
                x+=1;
            }
        }
        return x+y;
    }
}