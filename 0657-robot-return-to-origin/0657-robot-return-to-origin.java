class Solution {
    public boolean judgeCircle(String moves) {
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L')
                c1++;
            if(moves.charAt(i)=='R')
                c2++;
            if(moves.charAt(i)=='U')
                c3++;
            if(moves.charAt(i)=='D')
                c4++;
        }
        if(c1==c2 && c3==c4)
            return true;
        else 
            return false;
    }
}