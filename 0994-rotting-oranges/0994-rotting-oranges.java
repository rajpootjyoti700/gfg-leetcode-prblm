class pair{
    int row;
    int col;
    int tm;
    pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cntfre=0;
        Queue<pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==0)
                    cntfre++;
                
            }
        }
        
        int tm=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int count=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(t,tm);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    count++;
                }
            }
            
        }
        int count1=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(vis[i][j]==0)
                   count1++;
           }
       }
        if(count1!=cntfre)
            return -1;
        else
            return tm;
    }
}