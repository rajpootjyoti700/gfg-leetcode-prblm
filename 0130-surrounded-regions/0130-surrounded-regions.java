class Solution {
    public void dfs(int row,int col,int[][] vis,char[][] board,int[] drow,int[] dcol){
        vis[row][col]=1;
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && board[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,board,drow,dcol);
            }
        }
    }
    public void solve(char[][] board) {
        int[] drow={-1,0,+1,0};
        int[] dcol={0,1,0,-1};
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        // for 1st row and last row
        for(int j=0;j<m;j++){
            // first row
            if(vis[0][j]==0 && board[0][j]=='O')
                dfs(0,j,vis,board,drow,dcol);
            // last row
            if(vis[n-1][j]==0 && board[n-1][j]=='O')
                dfs(n-1,j,vis,board,drow,dcol);
                
        }
        // for 1st coloumn and the last column
        for(int i=0;i<n;i++){
            // first coloumn
            if(vis[i][0]==0 && board[i][0]=='O')
                dfs(i,0,vis,board,drow,dcol);
            // last column
            if(vis[i][m-1]==0 && board[i][m-1]=='O')
                dfs(i,m-1,vis,board,drow,dcol);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && board[i][j]=='O')
                    board[i][j]='X';
            }
        }
    }
}