class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Edge Case , consecutive zeros always give true answer
            if (nums[i - 1] == 0 && nums[i] == 0) {
                return true;
            }
            
            sum += nums[i];
            
            if (sum % k == 0) { // Check if the cumulative sum is divisible by k
                return true;
            }
            
            int j = 0;
            int tempSum = sum;
            
            while ((i - j) > 1 && tempSum >= k) {
                tempSum -= nums[j];
                j++;
                
                if (tempSum % k == 0) { // Check if temporary sum is divisible by k
                    return true;
                }
            }
        }
        // If no valid subarray is found, return false
        return false;
    }
}