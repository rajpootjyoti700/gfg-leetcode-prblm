class Solution {
    public boolean dfs(int node,int newcol,int[] color,int[][] graph){
        color[node]=newcol;
        for(int it: graph[node]){
            if(color[it]==-1){
                if(dfs(it,1-newcol,color,graph)==false)
                    return false;
            }
                else if(color[it]==newcol){
                    return false;
                }
                
        }
            return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        for(int i=0;i<n;i++){
            color[i]=-1;
        }
        for(int i=0;i<n;i++){
           if(color[i]==-1){
              if(dfs(i,0,color,graph)==false)
                  return false;
              
               }
        }
        return true;
    }
}