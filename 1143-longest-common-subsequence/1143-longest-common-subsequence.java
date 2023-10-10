class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return lcm(text1,text2,m,n,dp);
        
    }
    public int lcm(String text1,String text2,int m,int n,int[][] dp){
        if(m==0 ||n==0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(text1.charAt(m-1)==text2.charAt(n-1)){
            dp[m][n]=1+lcm(text1,text2,m-1,n-1,dp);
            return dp[m][n];
        }
        else{
             dp[m][n]= Math.max(lcm(text1,text2,m-1,n,dp),lcm(text1,text2,m,n-1,dp));
            return dp[m][n];
        }
            
    }
}