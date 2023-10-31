class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.sort(nums);
        int i=1;
        int j=n-1;
        while(i<n){
            arr[i]=nums[j];
            i=i+2;
            j--;
        }
        i=0;
        while(i<n){
            arr[i]=nums[j];
            i=i+2;
            j--;
        }
        for( i=0;i<n;i++){
            nums[i]=arr[i];
        }
        
    }
}