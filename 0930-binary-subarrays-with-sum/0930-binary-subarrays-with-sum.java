class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n1=fun(nums,goal);
        int n2=fun(nums,goal-1);
        return n1-n2;
    }
    
    public int fun(int[] nums,int goal){
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        
        while(r<nums.length){
            if(goal<0)
                return 0;
            sum=sum+nums[r];
            
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}