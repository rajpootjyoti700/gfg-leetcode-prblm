class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i,j;
        int n=cardPoints.length;
        int[] arr=new int[n] ;
            int tsum=0;
            for(i=0;i<n;i++){
                tsum=tsum+cardPoints[i];
                arr[i]=tsum;
                
            }
        if(k==n)
            return tsum;
        int score=0;
        int ans=0;
        for(i=0;i<=k;i++){
            j=i+n-k-1;
            if(i==0){
                ans=arr[j];
            }
            else{
            ans=arr[j]-arr[i-1];
            }
            score=Math.max(score,tsum-ans);
        }
        return score;
        
    }
}