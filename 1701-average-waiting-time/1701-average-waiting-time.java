class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        int currt=0;
        double totalw=0;
        for(int[] arr: customers){
            int arrt=arr[0];
            int cooking=arr[1];
            
            if(currt<arrt){
                currt=arrt;
            }
            
            int watt=(currt+cooking)-arrt;
            totalw=totalw+watt;
            currt=currt+cooking;
        }
        return totalw/n;
    }
}