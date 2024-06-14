class Solution {
    public int minIncrementForUnique(int[] nums) {
       /* int n=nums.length;
        int i=0;
        Arrays.sort(nums);
        int count=0;
        while(i<n-1){
            if(nums[i]==nums[i+1]){
                nums[i+1]=nums[i+1]+1;
                Arrays.sort(nums);
                count++;
                i=0;
            }
            else{
                i++;
            }
        }
        return count;
        */
         Arrays.sort(nums);
    var i = 0;
    var cnt = 0;

    for (var n : nums) {
      i = Math.max(i, n);

      cnt += i++ - n;
    }
    return cnt;
    }
}