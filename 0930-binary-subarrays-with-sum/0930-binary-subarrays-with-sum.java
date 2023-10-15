class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {   
         int i = 0, j = 0, count = 0, sum = 0, temp = 0;
        while (j<nums.length) {
            sum += nums[j];
            if (nums[j] == 1) temp = 0;
            if (sum > goal) {
                sum -= nums[i];
                i++;
            }
            while (sum == goal && i <= j) {
                temp++;
                sum -= nums[i];
                i++;
            }
            j++;
            count += temp;
        }
        return count; 
        
    }
}