class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n=numBottles;
        int ans=numBottles;
            while(n>=numExchange){
                int n1=n/numExchange;
               int n2=n%numExchange;
                n=n1+n2;
                ans=ans+n1;
            }
        return ans;
    }
}