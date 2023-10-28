import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> heap = new PriorityQueue();
    for(String n: nums){
        heap.offer(new BigInteger(n));
        
        if(heap.size() > k)
            heap.poll();
    }
    
    return heap.peek().toString(); 
    }
}