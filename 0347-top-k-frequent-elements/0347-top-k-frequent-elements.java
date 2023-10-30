class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]))
                mp.put(nums[i],mp.get(nums[i])+1);
            else
                mp.put(nums[i],1);
            
        }
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->Integer.compare(mp.get(a),mp.get(b)));
        int[] arr=new int[k];
        for(Integer i: mp.keySet()){
            p.add(i);
            if(p.size()>k)
                p.poll();
        }
        for(int i=0;i<k;i++){
                arr[i]=p.poll();
        }
        return arr;
    }
}