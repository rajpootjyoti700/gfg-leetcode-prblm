class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       /* int m=customers.length;
        int sum=0;
        int max=0;
        int k=0;
        int k1=0;
        int sum1=0;
        int max1=0;
        int ans=0;
        for(int i=0;i<m-minutes+1;i++){
            sum=0;
            sum1=0;
            for(int j=i;j<i+minutes;j++){
                
                sum=sum+customers[j];
                sum1=sum1+grumpy[j];
            }
            if(sum>=max){
                max=sum;
                k=i;
            }
            if(sum1>=max1 && customers[i]>=customers[k]){
                max1=sum1;
                k1=i;
            }
        }
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=customers[i];
        }
        for(int i=k;i<k+minutes;i++){
            customers[i]=0;
        }
        
        for(int i=0;i<m;i++){
            if(grumpy[i]==0){
                max=max+customers[i];
            }
        }
        for(int i=k1;i<k1+minutes;i++){
            grumpy[i]=0;
        }
        for(int i=0;i<m;i++){
            if(grumpy[i]==0){
                ans=ans+arr[i];
            }
        }
        if(max>=ans)
            return max;
        else 
            return ans;
            */
        int n = grumpy.length;
        int i = 0;
        int curWin = 0;
        int maxWin = 0;

        for(int j=0;j<n;j++) {
            curWin+=customers[j] * grumpy[j];
            maxWin = Math.max(curWin, maxWin);
            if(j >= minutes - 1 ) {
                curWin -= customers[i] * grumpy[i++];
            }
        }
        int res = maxWin;
        for(i=0;i<grumpy.length;i++) {
            res+=customers[i] * (1 - grumpy[i]);
        }
        return res;
        
    }
}