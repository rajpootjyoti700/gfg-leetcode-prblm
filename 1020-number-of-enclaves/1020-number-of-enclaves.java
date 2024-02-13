class Solution {
    public void dfs(int row,int col,int[][] vis,int[][] grid,int[] drow,int[] dcol){
        vis[row][col]=1;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                dfs(nrow,ncol,vis,grid,drow,dcol);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
int[] drow={-1,0,+1,0};
        int[] dcol={0,1,0,-1};
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        // for 1st row and last row
        for(int j=0;j<m;j++){
            // first row
            if(vis[0][j]==0 && grid[0][j]==1)
                dfs(0,j,vis,grid,drow,dcol);
            // last row
            if(vis[n-1][j]==0 && grid[n-1][j]==1)
                dfs(n-1,j,vis,grid,drow,dcol);
                
        }
        // for 1st coloumn and the last column
        for(int i=0;i<n;i++){
            // first coloumn
            if(vis[i][0]==0 && grid[i][0]==1)
                dfs(i,0,vis,grid,drow,dcol);
            // last column
            if(vis[i][m-1]==0 && grid[i][m-1]==1)
                dfs(i,m-1,vis,grid,drow,dcol);
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1)
                    count++;
            }
        }
        return count;
    }
    }
