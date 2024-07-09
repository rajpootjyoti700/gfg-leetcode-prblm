class Solution {
    public List<String> summaryRanges(int[] nums) {
       // this question is basically a from two pointer or interval
        // where we have to keep track left and the right pointer
        // or subarray
        // String.valueOf(nums[i]) convert the perticulr integer to the 
        // string
        
        int left=0;
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int right=i;
            if(i==nums.length-1 || nums[i]+1!=nums[i+1]){
                if(left==right){
                   list.add(String.valueOf(nums[i])); 
                }
                else{
                    list.add(nums[left]+"->"+nums[right]);
                }
                left=i+1;
            }
            
        }
        return list;
    }
}