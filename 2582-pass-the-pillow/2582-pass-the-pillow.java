class Solution {
    public int passThePillow(int n, int time) {
        int k=1;
        while(time!=0){
            k++;
            time--;
            if(k==n){
               while(time!=0 && k>1){
                   k--;
                   time--;
               } 
            }
            
        }
        return k;
    }
}