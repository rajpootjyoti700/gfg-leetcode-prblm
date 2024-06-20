class Solution {

    public boolean possible(int mid,int[] position,int m){
        int prev=position[0];
        int count=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-prev>=mid){
                count++;
                prev=position[i];
            }
            if(count==m)
                break;
        }
        return count==m;
    }
    public int maxDistance(int[] position, int m) {
         Arrays.sort(position);
        int ans=0;
        int min=1;
        int n=position.length;
        int max=position[n-1]-position[0];
        
        while(min<=max){
            int mid=min+(max-min)/2;
            if(possible(mid,position,m)){
                ans=mid;
                min=mid+1;
            }
            else
            max=mid-1;
        }
        return ans;
    }
}
