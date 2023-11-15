class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0)
            return false;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a : hand){
            pq.add(a);
        }
        while(!pq.isEmpty()){
            int min=pq.poll();
            for(int i=1;i<groupSize;i++){
                if(pq.remove(min+i))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}