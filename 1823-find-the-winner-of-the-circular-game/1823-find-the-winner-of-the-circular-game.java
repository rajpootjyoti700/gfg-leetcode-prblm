class Solution {
    public int findTheWinner(int n, int k) {
        // the aapproch is as it is in circular manner so modulo are needed
        // and we have to remove after every kth position 
        // ans +k the the position we want to eliminate 
        // and modulo of i are just becoz circle;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=(ans+k)%i;
        }
        return ans+1;
    }
}