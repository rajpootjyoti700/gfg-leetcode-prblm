class Solution {
    public long largestPerimeter(int[] nums) {
    
        int n=nums.length;
        long sum=0;
        long ans=0;
        Arrays.sort(nums);
        for( int j=n-1;j>=0;j--){
            sum=0;
            for(int i=0;i<j;i++){
                sum=sum+nums[i];
            }
            if(sum>nums[j]){
                ans=sum+nums[j];
                return ans;
            }
        }
        return -1;
    }
}