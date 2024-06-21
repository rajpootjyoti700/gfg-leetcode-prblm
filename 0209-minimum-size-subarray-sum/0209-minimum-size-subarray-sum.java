class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        /*int n=nums.length;
        int k=1;
        int sum=0;
        while(k<=n){
        for(int i=0;i<n-k+1;i++){
            sum=nums[i];
            for(int j=i+1;j<i+k;j++){
                sum=sum+nums[j];
                
            }
            if(sum>=target)
                return k;
        }
            k++;
    }
        return 0;
        */
        // 
        int low=0;
        int high=0;
        int minwindow=Integer.MAX_VALUE;
        int sum=0;
        while(high<nums.length){
            sum=sum+nums[high];
            high++;
            while(sum>=target){
                int currw=high-low;
                minwindow=Math.min(minwindow,currw);
                    sum=sum-nums[low];
                low++;
            }
        }
        if(minwindow==Integer.MAX_VALUE)
            return 0;
        else 
            return minwindow;
    }
}