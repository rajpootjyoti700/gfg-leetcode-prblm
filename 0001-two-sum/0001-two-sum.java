class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force appproach
      /* int[] a =new int[2];
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   a[0]=i;
                   a[1]=j;
               }
           }
       }
       return a;
       */
       // using hashing
       HashMap<Integer,Integer> mp= new HashMap<>();
       int[] a= new int[2];
       for(int i=0;i<nums.length;i++){
           int b=nums[i];
           int c=target-b;

           if(mp.containsKey(c)){
               a[0]=mp.get(c);
               a[1]=i;
           }
           mp.put(nums[i],i);
       }
       return a;
    }
}