class Solution {
    public int minPatches(int[] nums, int n) {
    long currentSum = 1; // Tracks the smallest number that cannot be formed
        int patches = 0;     // Number of patches added
        int index = 0;       // Index to iterate through the nums array

        // Continue until we can form numbers up to n
        while (currentSum <= n)
        {
            // If current index lies in the array 
            //and the current value is less than equal to the currentSum
            if (index < nums.length && nums[index] <= currentSum)
            {
                // If the current number in nums can be added to currentSum
                currentSum += nums[index]; // Include nums[index] in the range
                index++;
            }
            else
            {
                // Add a patch (currentSum itself) to cover the range up to currentSum * 2 - 1
                currentSum += currentSum;
                patches++;
            }
        }
        return patches;
    }
}