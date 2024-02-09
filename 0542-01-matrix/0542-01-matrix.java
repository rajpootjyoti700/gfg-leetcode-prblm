class pair{
    int first;
    int second;
    int third;
    pair(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}



class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] dis=new int[n][m];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(mat[i][j]==0){
                   q.add(new pair(i,j,0));
                       vis[i][j]=1;
               }
                else
                    vis[i][j]=0;
            }
        }
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
          int row=q.peek().first;
          int col=q.peek().second;
          int steps=q.peek().third;
            q.remove();
            dis[row][col]=steps;
            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new pair(nrow,ncol,steps+1));
                }
            }
        }
        return dis;
        }
}