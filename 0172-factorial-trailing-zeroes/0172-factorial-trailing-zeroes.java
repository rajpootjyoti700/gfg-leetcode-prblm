class Solution {
    public int trailingZeroes(int n) {
// as it is math ques so there is a logic behind this 
        // when we got any of 5 or multiple of 5  then one 0 will increase 
        // so we use this logic
        int count =0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        return count;
    }
}