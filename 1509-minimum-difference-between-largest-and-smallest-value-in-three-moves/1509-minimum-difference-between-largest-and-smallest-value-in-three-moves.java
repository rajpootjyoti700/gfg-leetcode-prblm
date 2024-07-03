class Solution {
    public int minDifference(int[] nums) {
        // we have 4 cases in this as we have to give the impact on min value and the max value
// case1 : all 3 from left
        // case2 all 3 from right
        // 1 from left 2 from right
        // 1 from right 2 from left
        
        int n=nums.length;
        Arrays.sort(nums);
        if(n<=4)
            return 0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=4;i++){
            min=Math.min(min,nums[n-i]-nums[4-i]);
        }
        return min;
    }
}