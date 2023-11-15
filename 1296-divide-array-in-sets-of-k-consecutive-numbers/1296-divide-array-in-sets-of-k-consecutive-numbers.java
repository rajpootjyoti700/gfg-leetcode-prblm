class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0)
            return false;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val : nums){
            pq.add(val);
        }
        while(!pq.isEmpty()){
            int min=pq.poll();
            for(int i=1;i<k;i++){
                if(pq.remove(min+i))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}