class Solution {
    private long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long a=pow(5,even)%mod;
        long b=pow(4,odd)%mod;
        return (int)((a*b)%mod);
    }
    private long pow(long x , long n){
        if(n==0)
            return 1;
        long temp=pow(x,n/2);
        if(n%2==0){
            return ((temp*temp)%mod);
        }
        else
              return ((x*temp*temp)%mod);
    }
}