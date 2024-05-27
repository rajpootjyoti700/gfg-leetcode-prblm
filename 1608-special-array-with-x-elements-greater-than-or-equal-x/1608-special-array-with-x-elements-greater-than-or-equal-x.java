class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int x=0;x<=n;x++){
            int count=0;
            for(int num: nums){
                if(num>=x)
                    count++;
            }
            if(count==x)
                return x;
        }
        return -1;
    }
}