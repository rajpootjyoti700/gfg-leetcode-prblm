class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        if(n==3){
            if(arr[0]%2!=0 && arr[1]%2!=0 && arr[2]%2!=0)
                return true;
        }
        for(int i=0;i<n-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
                return true;
        }
        return false;
    }
}