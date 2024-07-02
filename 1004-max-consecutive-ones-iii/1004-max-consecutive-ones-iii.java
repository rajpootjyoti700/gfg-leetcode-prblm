class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int max=0;
        int n=nums.length;
        int count=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0)
                count++;
            if(count>k){
                while(count>k){
                    if(nums[i]==0)
                        count--;
                    i++;
                }
            }
             max=Math.max(max,j-i+1);    
        }
        
    return max;
    }
}