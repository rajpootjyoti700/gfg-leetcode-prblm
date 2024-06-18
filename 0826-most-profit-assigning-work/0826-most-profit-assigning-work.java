class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=worker.length;
        int m=difficulty.length;
        int max=0;
        int k=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(difficulty[j]<=worker[i]){
                    max=Math.max(max,profit[j]);
                }
            }
            arr[k]=max;
            k++;
            max=0;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i]; 
        }
        return sum;
    }
}