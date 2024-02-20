class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
        int sumOfAll = n*(n+1)/2;
        for(int i : nums){
            sumOfAll -= i;
        }
        return sumOfAll; 
    }
}