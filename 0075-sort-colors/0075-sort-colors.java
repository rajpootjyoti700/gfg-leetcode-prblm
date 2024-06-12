class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
        int j=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[j]=nums[i];
                j++;
            }
        }
        
             for(int i=0;i<n;i++){
            if(nums[i]==1){
                ans[j]=nums[i];
                j++;
            }
            
        }
             for(int i=0;i<n;i++){
            if(nums[i]==2){
                ans[j]=nums[i];
                j++;
            }
            
        }
            for(int i=0;i<n;i++){
                nums[i]=ans[i];
            }
    }
}