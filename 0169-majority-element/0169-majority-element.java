class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ans=0;
        int count=n/2;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
               mp.put(nums[i],mp.get(nums[i])+1); 
            }
            else
            mp.put(nums[i],1);
        }
        for(int i=0;i<n;i++){
          if(mp.get(nums[i])>count){
              max=mp.get(nums[i]);
              max=Math.max(max,mp.get(nums[i]));
              
              }
        }
        for(int i=0;i<n;i++){
            if(mp.get(nums[i])==max)
                 ans=nums[i];
        }
        return ans;
    }
}