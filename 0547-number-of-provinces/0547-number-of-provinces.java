class Solution {
    
    public static void DFS(int node,ArrayList<ArrayList<Integer>> adjl,int[] vis){
        vis[node]=1;
        for(int it: adjl.get(node)){
            if(vis[it]==0){
                DFS(it,adjl,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjl=new ArrayList<ArrayList<Integer>>();
        int n=isConnected.length;
        int[] vis= new int[n];
        for(int i=0;i<n;i++){
            adjl.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j ){
                    adjl.get(i).add(j);
                    adjl.get(j).add(i);
                }
            }
        }
         int count=0;
            for(int i=0;i<n;i++){
                if(vis[i]==0){
                    count++;
                DFS(i,adjl,vis);
                }
            }
        
        return count;
    }
}