class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int digit;
        if(n==1)
            return true;
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
           // n=sum;
           // sum=0;
             sum=0;
            while(n>0){
                digit=n%10;
                sum=sum+(digit*digit);
                n=n/10;
            }
            if(sum==1)
                return true;
            else
                n=sum;
        }
        return false;
    }
}