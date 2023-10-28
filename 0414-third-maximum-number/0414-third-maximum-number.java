class Solution {
    public int thirdMax(int[] nums) {
    HashSet<Integer> mp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            mp.add(nums[i]);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] arr=new int[mp.size()];
        int j=0;
        for(int a: mp)
        {
          
            arr[j]=a;
            j++;
        }
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        if(arr.length<3)
            return pq.peek();
        for(int i=0;i<2;i++){
            pq.poll();
        }
        return pq.peek();
        
    }
}