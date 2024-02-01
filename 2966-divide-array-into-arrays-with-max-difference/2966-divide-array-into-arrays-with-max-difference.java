class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int[][] arr=new int[n/3][3];
        int c=0;
        if(n%3!=0)
            return new int[0][0];
        Arrays.sort(nums);
        for(int i=0;i<n/3;i++){
            for(int j=0;j<3;j++){
                if(c<n-1 && (c+3)%3==0 && nums[c+2]-nums[c]>k )
                    return new int[0][0];
                else{
                    arr[i][j]=nums[c];
                    c++;
                }
            }
        }
        return arr;
    }
}